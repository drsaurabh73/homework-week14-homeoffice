package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DurationOfStaypage extends Utility {

    public DurationOfStaypage() {
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessthansixmonth;
    public void clickonSixMonthorLess() {
        Reporter.log("Clicking on Six month of less"+ lessthansixmonth.toString()+ "<br>");
        clickOnElement(lessthansixmonth);
    }
    @FindBy (xpath = "//input[@id='response-1']")
    WebElement morethansixmonth;
    public void clickOnMoreThanSixMonth() {
        Reporter.log("Clicking on More than six month"+ morethansixmonth.toString()+ "<br>");
        clickOnElement(morethansixmonth);
    }

    public void selectLengthOfStay(String moreOrLess) {


        switch (moreOrLess) {
            case "6 months or less":
                Reporter.log("Clicking on 6 months or less"+ lessthansixmonth.toString()+ "<br>");
                clickOnElement(lessthansixmonth);
                break;
            case "longer than 6 months":
                Reporter.log("Clicking on longer than 6 months"+ morethansixmonth.toString()+ "<br>");
                clickOnElement(morethansixmonth);
                break;
            default:
                System.out.println("not valid choice");

        }
    }


}

