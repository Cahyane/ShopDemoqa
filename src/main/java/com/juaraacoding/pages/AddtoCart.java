package com.juaraacoding.pages;

import com.juaraacoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
    private WebDriver driver;
    public AddtoCart(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)"); }

//        @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[4]/div/div[1]/div/div/div/div[2]/div[2]/div[1]/div/h3/a")
//        WebElement addProduct;
//
//        @FindBy(xpath = "//*[@id='product-704']/div[1]/div[2]/form/div/div[2]/button")
//        WebElement addcart;
//
//        @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div/div/div[1]/div/a")
//        WebElement viewcart;
//
//        @FindBy(xpath = "//*[@id=\"post-6\"]/div/div/div[2]/div[2]/div/a")
//        WebElement checkout;
//
//    public void setAddProduct(WebElement addProduct) {
//        this.addProduct = addProduct;
//    }


}

