package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VisaConfirmationTest extends TestBase {

    StartPage startPage;
    WorkTypePage workTypePage;
    ReasonForTravelPage reasonForTravelPage;
    SelectNationalityPage selectNationalityPage;
    DurationOfStaypage durationOfStaypage;
    PlanningToWork planningToWork;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void init() {
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        reasonForTravelPage = new ReasonForTravelPage();
        selectNationalityPage = new SelectNationalityPage();
        durationOfStaypage = new DurationOfStaypage();
        planningToWork = new PlanningToWork();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        resultPage = new ResultPage();

    }
        @Test(groups = {"sanity","smoke","regression"})
        public void anAustralianCominToUKForTourism () {
            SoftAssert softAssert = new SoftAssert();
        //startPage.clickOnacceptCookies();
        startPage.clickStartNow();
        selectNationalityPage.selectNationalityAustralia("Australia");
        selectNationalityPage.setContinuebutton();
        reasonForTravelPage.selectReasonForTravel("tourism");
        reasonForTravelPage.clickOnContiuneButton();
       // softAssert.assertEquals(reasonForTravelPage.verifyTextVisanotRequired(),"You will not need a visa to come to the UK","");
      //  softAssert.assertAll();
            resultPage.confirmResultMessage("You will not need a visa to come to the UK");


        }
        @Test(groups = {"smoke","regression"})
     public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
            SoftAssert softAssert = new SoftAssert();
            startPage.clickStartNow();
            selectNationalityPage.selectNationalityAustralia("Chile");
            selectNationalityPage.setContinuebutton();
            reasonForTravelPage.selectReasonForTravel("academic");
            planningToWork.whereYouArePlanningToWork("Health and care professional");
            planningToWork.setClickcontinue();
            resultPage.confirmResultMessage("You need a visa to work in health and care");



    }
    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        SoftAssert softAssert = new SoftAssert();
        startPage.clickStartNow();
        selectNationalityPage.selectNationalityAustralia("Colombia");
        selectNationalityPage.setContinuebutton();
        reasonForTravelPage.selectReasonForTravel("joinpartner");
        reasonForTravelPage.clickOnContiuneButton();
        familyImmigrationStatusPage.clickOnFamilyImmigrationyes();
        familyImmigrationStatusPage.clickOnContinue();
        resultPage.confirmResultMessage("verify result 'You’ll need a visa to join your family or partner in the UK");


    }

}

