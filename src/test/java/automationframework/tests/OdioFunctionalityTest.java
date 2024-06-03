package automationframework.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationframework.TestComponents.BaseTest;
import automationframework.pageobjects.ActivityLogPage;
import automationframework.pageobjects.ComparativeAnalysisPage;
import automationframework.pageobjects.ConversationPage;
import automationframework.pageobjects.DashboardPage;
import automationframework.pageobjects.LoginPage;
import automationframework.pageobjects.ProductivityPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OdioFunctionalityTest extends BaseTest {
   @Test
	public void odioFunctionality() throws IOException, InterruptedException {
		DashboardPage dashboardPage=loginPage.loginApplication("admin@Insurancedekho.com", "password");
        String dashboardMainHeading=dashboardPage.dashboardPageMainHeading();
        Assert.assertEquals(dashboardMainHeading,"Insurance dekho");
        dashboardPage.clickFilterIcon();
        Thread.sleep(2000);
        dashboardPage.selectDropdown1();
        dashboardPage.selectDropdown2();
        Thread.sleep(2000);
        dashboardPage.clickApplyButton();
        Thread.sleep(1000);
        /*
        String moment=dashboardPage.verifyMoment();
        Assert.assertEquals(moment,"FusionAudit");
        String coe=dashboardPage.verifyCoe();
        Assert.assertEquals(coe,"GURGAON(Fusion)");
        String thisYear=dashboardPage.verifyThisYear();
        Assert.assertEquals(thisYear,"This Year");
        Thread.sleep(3000);
        String totalInteractionText=dashboardPage.totalInteraction();
       //Assert.assertEquals(totalInteractionText,"Total Interaction");
        
        String totalInteractionData=dashboardPage.totalInteractionData();
        
        if(totalInteractionData!=null && !totalInteractionData.trim().isEmpty()) {
        	System.out.println("total Interaction Data verification successful:- "+totalInteractionData);
        }
        else {
            System.out.println("total Interaction Data verification failed: total Interaction Data is null or blank.");
        }
        
        String averageCustomerWordFrequencyText=dashboardPage.averageCustomerWordFrequency();
        Assert.assertEquals(averageCustomerWordFrequencyText,"Average Customer Word Frequency");
        String averageCustomerWordFrequencyData=dashboardPage.averageCustomerWordFrequencyData();
        Thread.sleep(2000);
        if(averageCustomerWordFrequencyData!=null && !averageCustomerWordFrequencyData.trim().isEmpty()) {
        	System.out.println("average Customer Word Frequency Data verification successful:- "+averageCustomerWordFrequencyData);
        }
        else {
            System.out.println("average Customer Word Frequency Data verification failed: Numeric data is null or blank.");
        }
        Thread.sleep(2000);
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(2000);
        List<WebElement> topBottomCallerCount=dashboardPage.topBottomCaller();
        System.out.println("Top Caller & Bottom Caller Count is: "+topBottomCallerCount.size());
        Thread.sleep(4000);
        /*
        String callerData1=dashboardPage.call1();
        Thread.sleep(2000);
        System.out.println(callerData1);
        
        if(callerData1!=null && !callerData1.trim().isEmpty()) {
        	System.out.println("caller distribution chart Data verification successful:- "+callerData1);
        }
        else {
            System.out.println("caller distribution chart Data verification failed: Numeric data is null or blank.");
        }
     //
       
        Thread.sleep(2000);
        List<WebElement> callerDistribution=dashboardPage.callerDistribution();
        System.out.println(callerDistribution.size());
        
        Thread.sleep(2000);
        Actions act1=new Actions(driver);
        for(WebElement cd: callerDistribution) {
        	act1.moveToElement(cd).perform();
        	Thread.sleep(500);	
        }
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        List<WebElement> callDurationDistribution=dashboardPage.callDurationDistribution();
        System.out.println(callDurationDistribution.size());
        
        Thread.sleep(2000);
        Actions act2=new Actions(driver);
        for(WebElement cdd: callDurationDistribution) {
        	act2.moveToElement(cdd).perform();
        	Thread.sleep(500);	
        }
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(2000);
        List<WebElement> momentsPerformance=dashboardPage.momentsPerformance();
        System.out.println(momentsPerformance.size());
        Thread.sleep(2000);
        Actions act3=new Actions(driver);
        for(WebElement mp:momentsPerformance) {
        	act3.moveToElement(mp).perform();
        	Thread.sleep(500);	
        }
        js.executeScript("window.scrollBy(0,450)");
        Thread.sleep(5000);
        List<WebElement> ahtTime=dashboardPage.ahtTime();
        System.out.println(ahtTime.size());
        Thread.sleep(2000);
        Actions act4=new Actions(driver);
        for(WebElement aht1:ahtTime) {
        	act4.moveToElement(aht1).perform();
        	Thread.sleep(500);	
        }
        js.executeScript("window.scrollBy(0,150)");
        List<WebElement> ahtMonths=dashboardPage.ahtMonths();
        System.out.println(ahtMonths.size());
        Thread.sleep(2000);
        Actions act5=new Actions(driver);
        for(WebElement aht2:ahtMonths) {
        	act5.moveToElement(aht2).perform();
        	Thread.sleep(500);
        }
        js.executeScript("window.scrollBy(0,150)");
        List<WebElement> marchCompliance=dashboardPage.marchCompliance();
        System.out.println(marchCompliance.size());
        Thread.sleep(2000);
        Actions act6=new Actions(driver);
        for(WebElement compliance1:marchCompliance) {
        	act6.moveToElement(compliance1).perform();
        	Thread.sleep(500);
        }
        js.executeScript("window.scrollBy(0,150)");
        List<WebElement> aprilCompliance=dashboardPage.aprilCompliance();
        System.out.println(aprilCompliance.size());
        Thread.sleep(2000);
        Actions act7=new Actions(driver);
        for(WebElement compliance2:aprilCompliance) {
        	act7.moveToElement(compliance2).perform();
        	Thread.sleep(500);
        }
        Thread.sleep(2000);
        */
        JavascriptExecutor js=(JavascriptExecutor)driver;
        ConversationPage conversationPage=dashboardPage.clickConversationButton();
        Thread.sleep(3000);
        String conversationMainHeading=conversationPage.conversationPageMainHeading();
        Assert.assertEquals(conversationMainHeading,"Sales Calls");
        System.out.println(conversationMainHeading);
        Thread.sleep(2000);
        conversationPage.clickCallScore();
        Thread.sleep(5000);
        conversationPage.clickViewCallButton();
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        List<WebElement> stats=conversationPage.stats();
        System.out.println("total count of stat is: "+stats.size());
        //print the text of each element
        for(WebElement statsText:stats) {
        	String statsAllText=statsText.getText();
        	
        	if(statsAllText!=null && !statsAllText.trim().isEmpty()) {
            	System.out.println("stats text should be visible: "+statsAllText);
            }
            else {
                System.out.println("stats text verification failed");
            }
        }
        	
        	Thread.sleep(2000);
        	js.executeScript("window.scrollBy(0,-150)");
        	Thread.sleep(2000);
        	conversationPage.clickMomentsTab();
        	Thread.sleep(2000);
        	js.executeScript("window.scrollBy(0,200)");
        	Thread.sleep(2000);
        	js.executeScript("window.scrollBy(0,-200)");
        	List<WebElement> momentsText=conversationPage.moments();
        	System.out.println("total count of moment is "+momentsText.size());
        	for(WebElement moments:momentsText) {
            	String momentsTexts=moments.getText();
            	if(momentsTexts!=null && !momentsTexts.trim().isEmpty()) {
                	System.out.println("moments text should be visible: "+momentsTexts);
                }
                else {
                    System.out.println("moments text verification failed");
                }
        	}
            	List<WebElement> allMomentsHeading=conversationPage.momentsHeading();
            	System.out.println("total count of moments heading is "+allMomentsHeading.size());
            	
            	for(WebElement momentsHeading:allMomentsHeading) {
            		String momentsHead=momentsHeading.getText();
            		if(momentsHead!=null && !momentsHead.trim().isEmpty()) {
                    	System.out.println("moments header should be visible: "+momentsHead);
                    }
                    else {
                        System.out.println("moments header verification failed");
                    }
            	}
            	Thread.sleep(2000);
            	conversationPage.clickSignalsTab();
            	Thread.sleep(2000);
            List<WebElement> signals=conversationPage.allSignals();
            System.out.println("Total count of all signals Text "+signals.size());
            
            for(WebElement signalsText:signals) {
            	String allSignals=signalsText.getText();
            	if(allSignals!=null && !allSignals.trim().isEmpty()) {
            		System.out.println("signals should be visible: "+allSignals);
            	}
            	else{
            		System.out.println("all signals verification failed");
            	}
            }
            	conversationPage.clickQuestionsTab();
            	Thread.sleep(2000);
            	conversationPage.clickfoulLanguageTab();
            	Thread.sleep(2000);
            	conversationPage.clickTranscriptTab();
            	Thread.sleep(2000);
            	WebElement transcript=conversationPage.visibilityOfTranscript();
            	Assert.assertTrue(transcript.isDisplayed());
            	if(transcript.isDisplayed()) {
            		System.out.println("transcript is visible");
            	}
            	else {
            		System.out.println("transcript is not visible");
            	}
            	
                conversationPage.clickActionsTab();
                Thread.sleep(2000);
                conversationPage.clickFeedbackTab();
                Thread.sleep(2000);
                
                conversationPage.clickInsightsButton();
                Thread.sleep(2000);
                ActivityLogPage activityLogPage=conversationPage.clickActivityLog();
                Thread.sleep(2000);
                String activityLogMainHeading=activityLogPage.activityPageMainHeading();
                Assert.assertEquals(activityLogMainHeading,"Activity Log");
                System.out.println(activityLogMainHeading);
                Thread.sleep(2000);
                WebElement a=activityLogPage.clickSelectAllCrossIcon();
                Actions actions = new Actions(driver);
                actions.moveToElement(a).click().perform();
                Thread.sleep(1000);
                activityLogPage.enterEmployeeSearchbox();
                Thread.sleep(1000);
                activityLogPage.clickEmployeeAutosuggestion();
                Thread.sleep(1000);
                activityLogPage.clickApplyButton();
                Thread.sleep(1000);
                WebElement callDetails=activityLogPage.callDetail();
                Actions ac=new Actions(driver);
                ac.moveToElement(callDetails).perform();
                Thread.sleep(2000);
                activityLogPage.clickViewCall();
                Thread.sleep(2000);
                String conversationHeading=conversationPage.conversationPageMainHeading();
                Assert.assertEquals(conversationHeading,"Sales Calls");
                System.out.println(conversationHeading);
                Thread.sleep(2000);
                //conversationPage.clickActivityLog();
                //Thread.sleep(3000);
                //activityLogPage.clickResetButton();
                //Thread.sleep(1000);
                ProductivityPage productivityPage=activityLogPage.clickProductivity();
                Thread.sleep(2000);
                productivityPage.productivityPageMainHeading();
                productivityPage.clickDataButton();
                Thread.sleep(2000);
                String employeeId=productivityPage.getEmployeeeId();
                System.out.println("Employee id is "+employeeId);
                Thread.sleep(2000);
                if (employeeId != null && !employeeId.trim().isEmpty()) {
                    System.out.println("Employee ID value is not null or blank.");
                } else {
                    System.out.println("Employee ID value is null or blank.");
                }
                ComparativeAnalysisPage comparativeAnalysisPage=productivityPage.clickComparativeAnalysis();
                Thread.sleep(2000);
                comparativeAnalysisPage.comparativeAnalysisPageMainHeading();
               
                
                
                
               
                
                
                
                
   }	
            	
            }
           
                	
            
        	
        
        
        
        
   
   
        
   
   

        
        
        
        
        
        

