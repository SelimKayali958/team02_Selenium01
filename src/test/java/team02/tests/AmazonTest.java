package team02.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import team02.pages.AmazonPage;
import team02.utilities.TestBaseTeam02;

public class AmazonTest extends TestBaseTeam02 {

    @Test
    public void test01(){
        driver.get("http://amazon.com");
        AmazonPage amazonPages = new AmazonPage(driver);
        amazonPages.amazonAramaKutusu.sendKeys("kindle"+ Keys.ENTER);
        WebElement sonucKindle = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucKindle.getText());
    }

}
