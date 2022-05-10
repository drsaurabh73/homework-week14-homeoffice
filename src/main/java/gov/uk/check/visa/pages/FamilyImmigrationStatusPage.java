package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    // click on yes
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectyes;
    public void clickOnFamilyImmigrationyes() {
        Reporter.log("Clicking on Family Immigration yes"+ selectyes.toString()+ "<br>");
        clickOnElement(selectyes);
    }
    // click on continue
    @FindBy (xpath = "//button[contains(text(),'Continue')]")
    WebElement gocontinue;
    public void clickOnContinue() {
        Reporter.log("Clicking on go to continue"+ gocontinue.toString()+ "<br>");
        clickOnElement(gocontinue);
    }
}
