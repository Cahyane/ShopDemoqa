package com.juaraacoding.stepdefinitions;

import com.juaraacoding.drivers.DriverSingleton;
import com.juaraacoding.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestLogin {
    public static WebDriver driver;
    public LoginPage loginPage;


    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://shop.demoqa.com/my-account/");
        loginPage = new LoginPage();
    }



     //   String titleHeader = driver.getTitle();
     //   Assert.assertEquals(titleHeader, "My Account - ToolsQA Demo Site");


    @Test
    public void Login(){
        loginPage.login("Widya", "Cobacoba123");
    //    Assert.assertEquals(loginPage.getLoginTitle(),"Login");
    }

    @AfterClass
    public void quitBrowser() {
        delay(5);
        DriverSingleton.closeObjectInstance();
    }

    static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
