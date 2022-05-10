package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class PlanningToWork extends Utility {

    public PlanningToWork() {
        PageFactory.initElements(driver, this);
    }
    //Health and care professional
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement careprofessional;
    public void sethealthcareprofessional() {
        clickOnElement(careprofessional);
    }
    //Digital technology professional
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement technologyprofessional;
    //Academic or researcher
    @FindBy(xpath = "//input[@id='response-2']")
    WebElement academicorresearcher;
    //Work in arts or culture
    @FindBy(xpath = "//input[@id='response-3']")
    WebElement artorculture;
    //Professional sportsperson
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement sportsperson;
    //Religious worker
    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousworker;
    //I want to start a business
    @FindBy(xpath = "//input[@id='response-6']")
    WebElement iwanttostartbusiness;
    //I want to do another type of job - show me other work visas
    @FindBy(xpath = "//input[@id='response-7']")
    WebElement iwanttodoanotherjob;
    // continue
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickcontinue;
    public void setClickcontinue(){
        clickOnElement(clickcontinue);
    }
    public void whereYouArePlanningToWork(String typeofWork){

        switch (typeofWork) {
            case "Health and care professional":
                Reporter.log("Clicking on Health and care professional"+ careprofessional.toString()+ "<br>");
                clickOnElement(careprofessional);
                break;
            case "Digital technology professional":
                Reporter.log("Clicking on Digital technology professional"+ technologyprofessional.toString()+ "<br>");
                clickOnElement(technologyprofessional);
                break;
            case "Academic or researcher":
                Reporter.log("Clicking on Academic or researcher"+ academicorresearcher.toString()+ "<br>");
                clickOnElement(academicorresearcher);
                break;
            case "Work in arts or culture":
                Reporter.log("Clicking on Work in arts or culture"+ artorculture.toString()+ "<br>");
                clickOnElement(artorculture);
                break;
            case "Professional sportsperson":
                Reporter.log("Clicking on Professional sportsperson"+ sportsperson.toString()+ "<br>");
                clickOnElement(sportsperson);
                break;
            case "Religious worker":
                Reporter.log("Clicking on Religious worker"+ religiousworker.toString()+ "<br>");
                clickOnElement(religiousworker);
                break;
            case "I want to start a business":
                Reporter.log("Clicking on I want to start a business"+ iwanttostartbusiness.toString()+ "<br>");
                clickOnElement(iwanttostartbusiness);
                break;
            case "I want to do another type of job - show me other work visas":
                Reporter.log("Clicking on I want to do another type of job - show me other work visas"+ iwanttodoanotherjob.toString()+ "<br>");
                clickOnElement(iwanttodoanotherjob);
                break;
            default:
                System.out.println("not valid reason for work visa");
        }










        }

}
