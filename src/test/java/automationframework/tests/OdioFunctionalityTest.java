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
import org.testng.Assert;
import org.testng.annotations.Test;

import automationframework.TestComponents.BaseTest;
import automationframework.pageobjects.ConversationPage;
import automationframework.pageobjects.DashboardPage;
import automationframework.pageobjects.LoginPage;
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
        String moment=dashboardPage.verifyMoment();
        Assert.assertEquals(moment,"FusionAudit");
        String coe=dashboardPage.verifyCoe();
        Assert.assertEquals(coe,"GURGAON(Fusion)");
        String thisYear=dashboardPage.verifyThisYear();
        Assert.assertEquals(thisYear,"This Year");
        String totalInteractionText=dashboardPage.totalInteraction();
     // Assert.assertEquals(totalInteractionText,"Total Interaction");
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
     */
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        List<WebElement> distribution=dashboardPage.callDistribution();
        System.out.println(distribution.size());
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        for(WebElement e: distribution) {
        	act.moveToElement(e).perform();
        	Thread.sleep(500);
        	
        }
        
        Thread.sleep(2000);
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
        	Thread.sleep(2000);
        	js.executeScript("window.scrollBy(0,500)");
        	Thread.sleep(2000);
        	js.executeScript("window.scrollBy(0,-100)");
        	WebElement allTabs=driver.findElement(By.xpath("//ul[@class=\"nav nav-tabs\"]/li[2]"));
        	Thread.sleep(2000);
        	allTabs.click();
            
        	
        }
        
        
        
   
   
        
        
   }
}
        
        
        
        
        
        

