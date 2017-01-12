package com.mia.Test.Checkout;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mia.DB.SqlUtils;
import com.mia.Method.Tools.JsonParse;
import com.mia.Report.TestReport;
import com.mia.Test.*;
import com.mia.data.Constant;

@Listeners({ TestReport.class })
public class Checkout_Single_1 {
	private static Logger log = LogManager.getLogger("Checkout_Single_1");
	private static String filename = "src\\main\\java\\config\\config.json";
	private static String item_id;

	/*商品正常结算
	 * 1、添加商品到购物车,数量为1 2、勾选商品 3、点击结算按钮
	 */
	@BeforeMethod
	public static void BeforeMethod() {
		log.info("普通单品初始化数据");
		item_id = Constant.SingleItem_id;
		String item_size = JsonParse.File(filename,"add/SingleItem_size");
		// 初始商品状态
		String status = "UPDATE item SET STATUS='1' ,is_gift='0' ,spu_type='0',item_type='0' WHERE id="
				+ item_id;
		SqlUtils.update(status);
		// 初始商品库存
		String stock = "UPDATE stock_item SET stock_quantity=100 WHERE item_id=" + item_id;
		SqlUtils.update(stock);
		String response =  Topcart_add.add(item_id, item_size, "1");
		log.info("Topcart_add响应结果： " + response);
		Assert.assertEquals("200",response);
	}

	@Test(description="checckout_普通单品结算_1",groups = { "checkout", "checkout_single" })
	public static void Test() {
		String response =  Order_checkout.checkout();
		
		Assert.assertEquals("200",JsonParse.code(response));

		Reporter.log(response);

	}

	@AfterMethod
	public static void AfterMethod() {

		Cart_delete.delete();
	}

}
