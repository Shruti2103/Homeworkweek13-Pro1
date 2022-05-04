package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class WelcomePage extends Utility {
       By emailField=By.xpath("//input[@id='Email']");
       By passwordfield=By.xpath("//input[@id='Password']");
       By logInButton=By.xpath("//button[contains(text(),'Log in')]");
       By logOutTextMsg=By.linkText("Log out\");");
    By registerClick=By.xpath("//a[@class='ico-register']");
    public void  emailName(String email){
        sendTextToElement(emailField,email);
    }
    public void sendPassword(String password){
        sendTextToElement(passwordfield,password);
    }
     public void setLogInButton(){
        clickOnElement(logInButton);
     }
     public String setLogOutTextMsg(){
        return getTextFromElement(logOutTextMsg);
     }
    public void setRegisterClick(){
        clickOnElement(registerClick);
    }


}
