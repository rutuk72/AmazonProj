package com.Testproj.test;

import com.Testproj.base.browser;
import com.Testproj.page.AmazonHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderIphone extends browser {

    @Test
    public void addproduct() throws InterruptedException {

        AmazonHomePage obj=new AmazonHomePage();

        Thread.sleep(5000);

        obj.SearchforMobile();
        Thread.sleep(5000);

        obj.ClickonPhone();
        String actulPrice=obj.ValidatePrice();
        System.out.println(actulPrice);
        Assert.assertEquals(actulPrice,"51,499");

        Thread.sleep(5000);




    }
}

