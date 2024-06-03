package automationframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationframework.AbstractComponents.AbstractComponent;

public class ActivityLogPage extends AbstractComponent {

WebDriver driver;
	
	public ActivityLogPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//h2[text()='Activity Log']")
	WebElement activityLogMainHeading;
	
	@FindBy(xpath="(//*[local-name()='svg']//*[name()='path'])[1]")
	WebElement selectAllCrossIcon;
	
	@FindBy(xpath="//input[@id=\"tags-outlined\"]")
	WebElement employeeSearchBox;
	
	@FindBy(xpath="//li[text()='Seema Sachan ']")
	WebElement selectAutosuggestion;
	
	@FindBy(xpath="//i[@class=\"fadeIn animated bx bx-info-circle text-primary-blue\"]")
	WebElement activityLog1;
	
	@FindBy(xpath="//a[text()='View Call']")
	WebElement viewCall;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement activityLogApplyButton;
	
	@FindBy(xpath="//button[text()='Reset']")
	WebElement resetButton;
	
	@FindBy(xpath="//a[text()='Productivity']")
	WebElement productivityLink;
	
	
	
	public String activityPageMainHeading() {
		return activityLogMainHeading.getText();
	}
	
	public WebElement clickSelectAllCrossIcon() {
		return selectAllCrossIcon;	
	}
	
	public void enterEmployeeSearchbox() {
		employeeSearchBox.sendKeys("Seema");
	}
	
	public void clickEmployeeAutosuggestion() {
		selectAutosuggestion.click();
	}
	
	public void clickApplyButton() {
		activityLogApplyButton.click();
	}
	
	public WebElement callDetail() {
		return activityLog1;
	}
	
	public void clickViewCall() {
		viewCall.click();
	}
	
	public void clickResetButton() {
		resetButton.click();
	}
	
	public ProductivityPage clickProductivity() {
		productivityLink.click();	
		ProductivityPage productivityPage=new ProductivityPage(driver);
		return productivityPage;
	}
	
	

	}

