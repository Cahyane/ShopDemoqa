package com.juaraacoding.pages;

import com.juaraacoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "username")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;
    @FindBy(xpath = "/html/head/script[2]")
    WebElement loginTitle;



    public String getLoginTitle(){ return loginTitle.getText(); }


    public void login(String username, String password){
        this.username.sendKeys("Widya");
        this.password.sendKeys("Cobacoba123");
        btnLogin.click();
}

}
