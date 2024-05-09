package automationframework.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationframework.TestComponents.BaseTest;
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
        Thread.sleep(2000);
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
        
        String callerDistributionChart=dashboardPage.callerDistributionChart1();
        System.out.println(callerDistributionChart);
        
        if(callerDistributionChart!=null && !callerDistributionChart.trim().isEmpty()) {
        	System.out.println("caller distribution chart Data verification successful:- "+callerDistributionChart);
        }
        else {
            System.out.println("caller distribution chart Data verification failed: Numeric data is null or blank.");
        }
     
        }
        
        
   }
        
        
        
        
        
        
        

