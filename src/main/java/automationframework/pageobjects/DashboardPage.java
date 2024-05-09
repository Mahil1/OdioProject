package automationframework.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import automationframework.AbstractComponents.AbstractComponent;

public class DashboardPage extends AbstractComponent {
WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    @FindBy(xpath="//h3[text()='Insurance dekho']")
    WebElement dashboardMainHeading;
    
    @FindBy(xpath="//i[contains(@class,'bx-filter-alt')]")
    WebElement filterIcon;
    
    @FindBy(xpath="(//select[@as=\"select\"])[2]")
    WebElement staticDropdown1;
    
    @FindBy(xpath="(//select[@as=\"select\"])[3]")
    WebElement staticDropdown2;
    
    @FindBy(xpath="//button[text()='Apply']")
    WebElement applyButton;
    
    @FindBy(xpath="//span[text()='FusionAudit']")
    WebElement fusionAuditMoment;
    
    @FindBy(xpath="//span[text()='GURGAON(Fusion)']")
    WebElement gurgaonFusionCoe;
    
    @FindBy(xpath="//span[text()='This Year']")
    WebElement thisYearDate;
    
    @FindBy(xpath="//p[text()='Total Interaction']")
    WebElement totalInteractionText;
    
    @FindBy(xpath="//a[text()='502']")
    WebElement totalInteractionData;
    
    @FindBy(xpath="//p[text()='Average Customer Word Frequency']")
    WebElement averageCustomerWordFrequencyText;
    
    @FindBy(xpath="//h5[text()='1.34words/sec']")
    WebElement averageCustomerWordFrequencyData;
    
    @FindBy(xpath="//div[contains(@class,'dashboard-top-seller-card')]")
    List<WebElement> topBottomCaller;
    
    @FindBy(xpath="(//*[text()='209'])[1]")
    WebElement callerDistributionChart1;
    
    public String dashboardPageMainHeading() {
    	return dashboardMainHeading.getText();
    }
    
    public void clickFilterIcon() {
    	filterIcon.click();
    }
    
    public void selectDropdown1() {
    	Select sel=new Select(staticDropdown1);
    	sel.selectByVisibleText("GURGAON(Fusion)"); 	
    }
    
    public void selectDropdown2() {
    	Select sel=new Select(staticDropdown2);
    	sel.selectByVisibleText(" This Year "); 
    }
    
    public void clickApplyButton() {
    	applyButton.click();
    }
    
    public String verifyMoment() {
    	return fusionAuditMoment.getText();
    }
    
    public String verifyCoe() {
    	return gurgaonFusionCoe.getText();
    }
    
    public String verifyThisYear() {
    	return thisYearDate.getText();
    }
    
    public String totalInteraction() {
    	return totalInteractionText.getText();
    }
    
    public String totalInteractionData() {
    	return totalInteractionData.getText();
    }
    public String averageCustomerWordFrequency() {
    	return averageCustomerWordFrequencyText.getText();
    }
    public String averageCustomerWordFrequencyData() {
    	return averageCustomerWordFrequencyData.getText();
    }
   
    public List<WebElement> topBottomCaller() {
    	return topBottomCaller;
    }
    
    public String callerDistributionChart1() {
    	return callerDistributionChart1.getText();
    }
   
    
    
	
}
