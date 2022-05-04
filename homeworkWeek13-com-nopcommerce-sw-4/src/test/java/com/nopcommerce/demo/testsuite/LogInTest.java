package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.TestBase;

import com.nopcommerce.demo.pages.LogInPage;

import com.nopcommerce.demo.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {

    LogInPage homePage = new LogInPage();
    WelcomePage welcomePage=new WelcomePage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        homePage.clickOnLoginButton();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = homePage.varifytheTextMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Welcome page not Displaying");


    }

    @Test
    public void  userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginButton();
        welcomePage.emailName("primetesting222@gmail.com");
        welcomePage.sendPassword("prime123");
        welcomePage.setLogInButton();

        String expectedMessage = "Log out";
        String actualMessage = homePage.setLogoutText();
        Assert.assertEquals(actualMessage, expectedMessage, "User is not on Logout");


    }
     @Test
    public void  verifyTheErrorMessage (){
        homePage.setLoginClick();
        homePage.setUserName("Shruti");
        homePage.setPasswordField("Devani");
        homePage.setLoginButton();


         String expectedMessage = "Returning Customer";

         String actualResult = homePage.verifyError();
         Assert.assertEquals(actualResult,expectedMessage,"User is logged in successfully");


     }


}




