package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.TestBase;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.WelcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    WelcomePage welcomePage=new WelcomePage();
    RegisterPage registerPage=new RegisterPage();
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
      welcomePage.setRegisterClick();
      String expectedMessage="Register";
      String actualMessage=registerPage.setVarifyRegisterText();
        Assert.assertEquals(actualMessage,expectedMessage,"User is not on RegisterPage");



    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        registerPage.clickOnRegisterButton();
        registerPage.clickonRadioButton();
        registerPage.setFirstName("Prime");
        registerPage.setLasttName("Testing");
        registerPage.setSelectDay("5");
        registerPage.setSelectMonth("January");
        registerPage.setSelectyear("2001");
        registerPage.setEmailId("primetesting222@gmail.com");
       registerPage.setPassword("prime123");
       registerPage.setConfirmedPassword("prime123");
       registerPage.clickOnRegister();
       String expectedText="Your registration completed";
       String actualText= registerPage.sucessfullyRegisterText();
       Assert.assertEquals(actualText,expectedText,"Register is not succwssfully");




    }










}
