package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.TestBase;
import com.nopcommerce.demo.pages.TopMenuPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenuPage=new TopMenuPage();
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){

        topMenuPage.setComputerclick();
        topMenuPage.setVarrifyComputer();
        topMenuPage.setElectronicsClick();
        topMenuPage.setvarrifyElectronics();
        topMenuPage.setApprealClick();
        topMenuPage.setvarrifyAppreal();
        topMenuPage.setdigitalDownloadClick();
        topMenuPage.setVarifydigitalDownload();
        topMenuPage.setBooksClick();
        topMenuPage.setVarrifyBooks();
        topMenuPage.setJewelryClick();
        topMenuPage.setVarifyjewelry();
        topMenuPage.setGiftCardClick();
        topMenuPage.setVarrifygiftCard();





    }




















}
