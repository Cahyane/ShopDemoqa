package com.juaraacoding.stepdefinitions;

import com.juaraacoding.drivers.DriverSingleton;
import com.juaraacoding.pages.AddtoCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestAddCart {
    public static WebDriver driver;
    public AddtoCart addtoCart;

    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        addtoCart = new AddtoCart();}

        @Test (priority = 1)
        public void Url (){
        driver.get("https://shop.demoqa.com/");
        String titleHeader = driver.getTitle();
        Assert.assertEquals(titleHeader, "Shop Demoqa");
    }

        @Test(priority = 2)
        public void AddtoCart () {
            WebElement addProduct = driver.findElement(By.xpath(" //*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")); //1
            Assert.assertTrue(addProduct.isDisplayed());
            WebElement addCart = driver.findElement(By.xpath(" ///*[@id='product-704']/div[1]/div[2]/form/div/div[2]/button")); //2
            Assert.assertTrue(addCart.isDisplayed());
            WebElement viewCard = driver.findElement(By.xpath(" //*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")); //3
            Assert.assertTrue(viewCard.isDisplayed());
            WebElement checkout = driver.findElement(By.xpath(" //*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")); //4
            Assert.assertTrue(checkout.isDisplayed());
        }


        @AfterClass
        public void quitBrowser () {
        delay(3);
        DriverSingleton.closeObjectInstance();
            }
            static void delay ( long detik){
                try {
                    Thread.sleep(detik * 1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
