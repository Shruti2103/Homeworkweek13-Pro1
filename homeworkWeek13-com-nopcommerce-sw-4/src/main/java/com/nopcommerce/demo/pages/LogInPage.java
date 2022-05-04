package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;

import org.openqa.selenium.By;

public class LogInPage extends Utility {


    By loginField = By.xpath("//a[@class='ico-login']");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By loginClick = By.xpath("//a[@class='ico-login']");
    By userName = By.id("Email");
    By passwordField = By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By logoutText = By.linkText("Log out");
    By errorMessage=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]");


    public void clickOnLoginButton() {
        clickOnElement(loginField);
    }

    public String varifytheTextMessage() {
        return getTextFromElement(welcomeText);
    }

    public void setLoginClick() {
        clickOnElement(loginClick);
    }

    public void setUserName(String user) {
        sendTextToElement(userName, user);
    }

    public void setPasswordField(String password) {
        sendTextToElement(passwordField, password);

    }
    public void setLoginButton(){
        clickOnElement(loginButton);
    }

    public String setLogoutText(){
      return getTextFromElement(logoutText);
    }
    public String verifyError(){
        return  getTextFromElement(errorMessage);
    }


}