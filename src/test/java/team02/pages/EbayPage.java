package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class EbayPage {

    public EbayPage () {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "gh-ac")
    public WebElement ebayAramaKutusu;

    @FindBy (id = "gh-cat")
    public  WebElement ebayAllCategories;

    @FindBy (id = "gh-btn")
    public WebElement ebaySearchButonu;

    @FindBy (xpath  = "//h1[@class='srp-controls__count-heading']")
    public WebElement ebaySonucSayisi;

}
