package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {

    By computerclick= By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By varifyComputer=By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By electronicsClick=By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By verifyElectronics=By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apprealClick= By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1] ");
    By varifyApparel= By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
    By digitalDownloadClick=By.linkText("Digital downloads");
    By varifydigitalDownload=By.linkText("Digital downloads");
    By booksClick= By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By booksVarify=By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
    By jewelryClick= (By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
    By varifyjewlry=(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
    By giftCardClick=By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");
    By varifygiftCard =By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");


       public void setComputerclick(){
        clickOnElement(computerclick);
       }
       public String setVarrifyComputer(){
        return getTextFromElement(varifyComputer);
       }
      public void setElectronicsClick(){
           clickOnElement(electronicsClick);
      }
      public String setvarrifyElectronics(){
           return getTextFromElement(verifyElectronics);
      }
      public void setApprealClick(){
           clickOnElement(apprealClick);
      }
     public String setvarrifyAppreal() {
       return getTextFromElement(varifyApparel);

     }
     public void setdigitalDownloadClick(){
           clickOnElement(digitalDownloadClick);
    }

    public String setVarifydigitalDownload(){
        return getTextFromElement(varifydigitalDownload);
    }

     public void setBooksClick(){
           clickOnElement(booksClick);
     }

     public String setVarrifyBooks(){
           return getTextFromElement(booksVarify);
     }
     public void setJewelryClick(){
           clickOnElement(jewelryClick);
     }
     public String setVarifyjewelry(){
           return getTextFromElement(varifyjewlry);
     }

     public void setGiftCardClick(){
           clickOnElement(giftCardClick);
     }
     public String setVarrifygiftCard(){
           return getTextFromElement(varifygiftCard);
     }




}
