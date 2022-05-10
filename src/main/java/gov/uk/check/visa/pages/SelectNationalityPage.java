package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    //select national  = //select[@id='response']
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalitycountry;
   public void selectNationalityAustralia(String nationality) {
       Reporter.log("Selecting day"+nationality+" from dropdown "+nationalitycountry.toString() + "<br>");
        selectByVisibleTextFromDropDown(nationalitycountry,nationality);
    }
    // click on continue
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continuebutton;
    public void setContinuebutton() {
        Reporter.log("Clicking on continue"+ continuebutton.toString()+ "<br>");
        clickOnElement(continuebutton);
    }


}
