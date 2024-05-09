package automationframework.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationframework.AbstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="inputEmail")
	WebElement username;
	
	@FindBy(id="inputChoosePassword")
	WebElement passwordEle;
	
	@FindBy(xpath="//button[text()=' Sign in']")
	WebElement signIn;
	/*
	@FindBy(css="[class*='capitalize.fw-bold.text-light']")
	WebElement errorMessage;
	*/
	public DashboardPage loginApplication(String email, String password) {
		username.sendKeys(email);
		passwordEle.sendKeys(password);
		signIn.click();
		DashboardPage dashboardPage=new DashboardPage(driver);
		return dashboardPage;
	}
	/*
	public String getErrorMessage() {
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}
	*/
	public void goTo() {
		driver.get("http://65.108.148.94/login");
	}
}
