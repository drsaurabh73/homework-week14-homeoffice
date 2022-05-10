package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    // you are comming for tourism what = //input[@value='tourism']

    @FindBy(xpath = "//input[@value='tourism']")
    WebElement tourism;

    public void clickOnVisitingAsTourist() {
        Reporter.log("Clicking on Visiting As Tourist"+ tourism.toString()+ "<br>");
        clickOnElement(tourism);
    }

    // work academic
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement academic;
    public void clickOnAcademicTravel() {
        Reporter.log("Clicking on Academic Travel"+ academic.toString()+ "<br>");
        clickOnElement(academic);
    }
    // join partner
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinpartner;
    public void clickOnVisitingpartner() {
        Reporter.log("Clicking on Visiting Partner"+ joinpartner.toString()+ "<br>");
       clickOnElement(joinpartner);
    }

// click on continue
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickcontinue;

    public void clickOnContiuneButton() {
        Reporter.log("Clicking on continue"+ clickcontinue.toString()+ "<br>");
        clickOnElement(clickcontinue);

    }
    // verify text You will not need a visa to come to the UK
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement youwillnotneedvisa;

    public String verifyTextVisanotRequired() {
        Reporter.log("getting visa not required text from "+youwillnotneedvisa.toString()+"<br>");
        return getTextFromElement(youwillnotneedvisa);
    }

    public void selectReasonForTravel(String reason) {
        if(reason == "tourism") {
            clickOnVisitingAsTourist();
        } else if(reason == "academic") {
            Reporter.log("Clicking on academic"+ academic.toString()+ "<br>");
            clickOnAcademicTravel();
        } else if(reason == "joinpartner"){
            Reporter.log("Clicking on joinpartner"+ joinpartner.toString()+ "<br>");
            clickOnVisitingpartner();

        }
    }

}

