package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class GooglePage {

    public GooglePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "realbox")
    public WebElement googleAramakutusu;



}