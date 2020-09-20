package team02.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team02.pages.AmazonPage;
import team02.pages.GooglePage;
import team02.utilities.ConfigurationReader;
import team02.utilities.Driver;
import team02.utilities.TestBaseFinal;

public class AmazonRaporTest extends TestBaseFinal {

    @Test
    public void amazonRapor(){
        extentTest = extentReports.createTest("amazonRapor","amazonda samsung arama");
        extentTest.info("amazon.com gitiyoruz. driver classini kullanarak");
        Driver.getDriver().get(ConfigurationReader.getProperty("amazonUrl"));
        extentTest.info("amazon page clasindan nesne uretiyoruz");
        AmazonPage amazonPage = new AmazonPage(Driver.getDriver());
        extentTest.info("amazon arama kutusunda samsung aratiniz");
        amazonPage.amazonAramaKutusu.sendKeys(ConfigurationReader.getProperty("amazonText")+ Keys.ENTER);
        extentTest.info("sonucBolumu'nun içerisindeki yazıları alalim");
        String sonuc = amazonPage.amazonSonuc.getText();
        extentTest.info("dogrulama işlemi yapıyoruz.");
        Assert.assertTrue(sonuc.contains(ConfigurationReader.getProperty("amazonText")));
        extentTest.pass("passed");


    }

}
