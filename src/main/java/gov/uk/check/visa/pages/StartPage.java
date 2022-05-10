package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    // accept cookies = //button[@data-track-action='Cookie banner accepted']
    @FindBy (xpath = "//button[@data-track-action='Cookie banner accepted']")
    WebElement acceptcookies;
    public void clickOnacceptCookies() {
        clearTextToElement(acceptcookies);
    }
    // click on start now
    @FindBy (xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startnow;
    public void clickStartNow() {
        Reporter.log("Clicking on Start Now"+ startnow.toString()+ "<br>");
        clickOnElement(startnow);
    }

}
