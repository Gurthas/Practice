package com.example.cases;

import com.example.base.Assertion;
import com.example.base.InitAppium;
import com.example.operation.LoginOperate;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * ��¼��������
 * Created by LITP on 2016/9/22.
 */

public class Login extends InitAppium {

    private LoginOperate loginOperate;


    @BeforeClass
    public void initDriver(){
        Assert.assertNotNull(driver);
        loginOperate = new LoginOperate(driver);
    }

    /**
     * �����ʺŶ� ���벻�����
     */
    @Test(priority = 0)
    public void loginErrorUser(){
        boolean flag = loginOperate.login("13192624740","iuhihj");
        Assertion.verifyEquals(flag,true,"�ʺŶ���������Ƿ��¼�ɹ�");
        print("�ʺ����벻�������¼:"+ flag);
    }

    /**
     * �����ʺ������񲻶����
     */
    @Test(priority = 1)
    public void loginErrorNum(){
        boolean flag = loginOperate.login("1319262asdfsddsasdfsdfsdfsdfsdfsdf4740","dfgd#@$1234fgdsfgdsgdffds");
        Assertion.verifyEquals(flag,true,"�ʺ������ʽ�����Ƿ��¼�ɹ�");
        print("�ʺ������ʽ���������¼:"+ flag);
    }


    /**
     * �����ʺ�����Ϊ�������
     */
    @Test(priority = 2)
    public void loginChinese(){
        boolean flag = loginOperate.login("�ʺ�","����");
        Assertion.verifyEquals(flag,true,"�ʺ�����Ϊ�����Ƿ��¼�ɹ�");
        print("�ʺ�����Ϊ���������¼:"+ flag);
    }



    /**
     * �����ʺ�����Ϊ�����
     */
    @Test(priority = 3)
    public void loginEmpty(){
        boolean flag = loginOperate.login("","");
        Assertion.verifyEquals(flag,true,"�ʺ�����Ϊ���Ƿ��¼�ɹ�");
        print("�ʺ�����Ϊ�������¼:"+ flag);
    }


    /**
     * �����ʺ�������ȷ���
     */
    @Test(priority = 4)
    public void loginConfim() {
        boolean flag = loginOperate.login("13192624740","xxxxxx");
        print("�ʺ�����Ե������¼:"+ flag);
        Assert.assertTrue(flag,"�ʺ�����Ե������¼");

    }

}
