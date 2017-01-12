package com.mia.Test.Checkout;

import java.text.SimpleDateFormat;
import java.util.Date;

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
public class Checkout_Single_6 {
	private static Logger log = LogManager.getLogger("Checkout_Single_6");
	private static String item_id;
	private static String filename = "src\\main\\java\\config\\config.json";
	private static String settle_amount;
	private static String promotion;
	private static String promotion_id;
	/*满减活动，结算时活动结束
1、添加商品到购物车,数量为1
2、状态和库存都改为初始值
3、后台添加商品参加满减活动
4、勾选商品
5、商品选择参加满减活动，并且符合活动
6、活动后台结束
	 */
	@BeforeMethod
	public static void BeforeMethod() {
		log.info("普通单品初始化数据");
		item_id = Constant.SingleItem_id;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		

		String item_size = JsonParse.File(filename,"add/SingleItem_size");
		promotion_id = JsonParse.File(filename,"add/promotion_mid");
		// 初始商品状态,商品价格200
		String status = "UPDATE item SET STATUS='1' ,is_gift='0' ,sale_price='200',spu_type='0',item_type='0' WHERE id="
				+ item_id;
		SqlUtils.update(status);
		// 初始商品库存
		String stock = "UPDATE stock_item SET stock_quantity=100 WHERE item_id=" + item_id;
		SqlUtils.update(stock);
		promotion = "update promotion set status='3' where id="  + promotion_id;
		
		SqlUtils.update(promotion);
		String promotion_delete = "delete from promotion_items where promotion_id ="  + promotion_id;
		SqlUtils.update(promotion_delete);
		promotion = "INSERT INTO `promotion_items` (`promotion_id`, `sku`, `active_price`, `app_price`, `status`, `max_buy`, `day_limited`, `is_best`, `limit_stock`, `remark`, `user_id`, `department_id`, `order`, `recent_sale_num`, `recent_sale_amount`, `min_sale_amount`, `old_promotion_price`, `item_level`, `update_time`, `activity_dynamics`, `groupon`, `short_title`, `short_info`, `gross_margin`, `payprice`, `tax_active_price`, `tax_price`, `gross_mergin_price`)" +
				"VALUES (" + promotion_id + ", "+ item_id +", 148.00, 148.00, 0, -1, -1, 0, -1, '0', 0, 0, 0, 0, 0.00, 0.00, '', -1,' "+ df.format(new Date()) + "', NULL, 0, '', '', 6.00, 0.00, 0.00, 0.00, 0.00)";
	
		SqlUtils.update(promotion);
		promotion = "update promotion set full_money=200 where id="  + promotion_id;
		
		SqlUtils.update(promotion);
		
		String response =  Topcart_add.add(item_id, item_size, "1");
		log.info("Topcart_add响应结果： " + response);
		
		Assert.assertEquals("200",response);
		response = Cart_info.info();
		settle_amount = JsonParse.code(response,"content/cart_total/settle_amount");
		
		promotion = "update promotion set status=-1 where id="  + promotion_id;
		
		SqlUtils.update(promotion);
	}

	@Test(description="checckout_普通单品结算_6",groups = { "checkout", "checkout_single" })
	public static void Test() {
		String response =  Order_checkout.checkout();
		
		Assert.assertEquals("200",JsonParse.code(response));

		String pay_price = JsonParse.code(response,"content/cart_total/pay_price");
		Assert.assertEquals("180",settle_amount);
		Assert.assertEquals("200",pay_price);
		Reporter.log(response);

	}

	@AfterMethod
	public static void AfterMethod() {

		Cart_delete.delete();
	}

}
