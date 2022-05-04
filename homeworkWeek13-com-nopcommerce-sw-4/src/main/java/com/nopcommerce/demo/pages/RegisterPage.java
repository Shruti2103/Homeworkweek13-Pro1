package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerLink = By.linkText("Register");
    By radioBtn = By.xpath("//input[@id='gender-female']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By selectDay = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    By selectMonth = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    By selectYear = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    By emailId = By.xpath("//input[@id='Email']");
    By passwordId = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By clickRegisterButton = By.name("register-button");
    By varifyRegisterText=By.xpath("//h1[contains(text(),'Register')]");
    By sucessgulRegisterText=By.xpath("//div[contains(text(),'Your registration completed')]");

    public void clickOnRegisterButton() {
        clickOnElement(registerLink);
    }

    public void clickonRadioButton() {
        clickOnElement(radioBtn);
    }

    public void setFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    public void setLasttName(String name) {
        sendTextToElement(lastName, name);
    }

    public void setSelectDay(String date) {
        selectByVisibleTextFromDropDown(selectDay,date);

    }

    public void setSelectMonth(String month) {
        selectByVisibleTextFromDropDown(selectMonth, month);
    }

    public void setSelectyear(String year) {
        selectByVisibleTextFromDropDown(selectYear, year);
    }

    public void setEmailId(String email) {
        sendTextToElement(emailId, email);
    }

    public void setPassword(String password) {
        sendTextToElement(passwordId, password);
    }

    public void setConfirmedPassword(String password) {
        sendTextToElement(confirmPassword, password);
    }

    public void clickOnRegister() {
        clickOnElement(clickRegisterButton);
    }
    public String setVarifyRegisterText(){
        return getTextFromElement(varifyRegisterText);
    }
     public String sucessfullyRegisterText(){
        return getTextFromElement(sucessgulRegisterText);
     }
}
