package team02.smokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import team02.pages.EbayPage;
import team02.utilities.ConfigurationReader;
import team02.utilities.Driver;

import java.util.List;

public class EbaySmokeTest {

    @Test
    public void test01 (){
        Driver.getDriver().get(ConfigurationReader.getProperty("ebayUrl"));
        EbayPage ebayPage = new EbayPage();
        ebayPage.ebayAramaKutusu.sendKeys(ConfigurationReader.getProperty("ebayText"));
        ebayPage.ebaySearchButonu.click();
        String sonuc = ebayPage.ebaySonucSayisi.getText();
        System.out.println("Arama sonucu : "+sonuc);
        System.out.println();
        Driver.getDriver().navigate().back();
        Select select = new Select(ebayPage.ebayAllCategories);
        List <WebElement> list = select.getOptions();

        for (WebElement w : list){
            System.out.println(w.getText());
        }

        System.out.println();

        int count = 0;
        for (WebElement w : list){
            if(w.getText().length()%2==1){
                count++;
            }
        }

        System.out.println("All categories icinde uzunlugu tek olan "+count+" tane sekme vardir");

    }

    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }


}
