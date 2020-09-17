package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class WalmartPage {

    public WalmartPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "global-search-input")
    public WebElement walmartAramaKutusu;

    @FindBy (xpath = "//span[@class='g_b']")
    public WebElement walmartSearchButonu;



}
