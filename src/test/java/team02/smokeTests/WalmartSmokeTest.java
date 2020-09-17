package team02.smokeTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import team02.pages.WalmartPage;
import team02.utilities.ConfigurationReader;
import team02.utilities.Driver;

public class WalmartSmokeTest {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigurationReader.getProperty("walmartUrl"));
        WalmartPage walmartPage = new WalmartPage();
        walmartPage.walmartAramaKutusu.sendKeys(ConfigurationReader.getProperty("walmartText"));
        walmartPage.walmartSearchButonu.click();

    }

    @AfterClass
    public void tearDown (){
        Driver.closeDriver();
    }

}
