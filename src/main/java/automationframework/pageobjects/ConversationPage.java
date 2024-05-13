package automationframework.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationframework.AbstractComponents.AbstractComponent;

public class ConversationPage extends AbstractComponent {

WebDriver driver;
	
	public ConversationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h2[text()='Sales Calls']")
	WebElement conversationsMainHeading;
	
	@FindBy(xpath="(//span[contains(text(),'CALL')])[2]")
	WebElement callScore;
	
	@FindBy(xpath="//button[text()='View Call']")
	WebElement viewCallButton;
	
	@FindBy(xpath="//li[@class=' list-group-item d-flex total-duration-stats ']")
	List<WebElement> statsText;
	
	@FindBy(xpath="//button[text()='MOMENTS']")
	WebElement momentsTab; 
	
	public String conversationPageMainHeading() {
		return conversationsMainHeading.getText();
	}
	
	public void clickCallScore() {
		callScore.click();
	}
	
	public void clickViewCallButton() {
		viewCallButton.click();
	}
	
	public List<WebElement> stats() {
		return statsText;
	}
	
	public void clickMomentsTab() {
		momentsTab.click();
	}

	}
