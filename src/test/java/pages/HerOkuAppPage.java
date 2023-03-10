package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerOkuAppPage {
    public HerOkuAppPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@onclick='addElement()']")
    public WebElement addElementButonu;

    @FindBy(xpath = "//button[@class='added-manually']")
    public WebElement deleteButonu;
}
