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
	
	@FindBy(xpath="//ul[@class=\"nav nav-tabs\"]/li[2]")
	WebElement momentsTab; 
	
	@FindBy(xpath="//table[@class=\"table mb-0\"]/tbody/tr/td[1]")
	List<WebElement> allMoments;
	
	@FindBy(xpath="//table[@class=\"table mb-0\"]/tbody/tr/th")
	List<WebElement> momentsHeading;
	
	@FindBy(xpath="//ul[@class=\"nav nav-tabs\"]/li[3]")
	WebElement signalsTab;
	
	@FindBy(xpath="//h2[@class=\"accordion-header\"]")
	List<WebElement> allSignalsText;
	
	@FindBy(xpath="//ul[@class=\"nav nav-tabs\"]/li[4]")
	WebElement questionsTab;
	
	@FindBy(xpath="//ul[@class=\"nav nav-tabs\"]/li[5]")
	WebElement foulLanguageTab;
	
	@FindBy(xpath="//ul[@class=\"nav nav-tabs\"]/li[6]")
	WebElement transcriptTab;
	
	@FindBy(xpath="(//div[@class=\"list-group moment-list-group-scroll mb-2\"])[3]/a[1]")
	WebElement transcript;
	
	@FindBy(xpath="//ul[@class=\"nav nav-tabs\"]/li[7]")
	WebElement actionsTab;
	
	@FindBy(xpath="//ul[@class=\"nav nav-tabs\"]/li[8]")
	WebElement feedbackTab;
	
	@FindBy(xpath="//div[text()='Insights']")
    WebElement insightsButton;
	
	@FindBy(xpath="//a[text()='Activity Log']")
	WebElement activityLogLink;
	
	
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
	
	public List<WebElement> moments() {
		return allMoments;
	}
	
	public List<WebElement> momentsHeading() {
		return momentsHeading;
	}
	
	public void clickSignalsTab() {
		signalsTab.click();
	}
	
	public List<WebElement> allSignals() {
		return allSignalsText;
	}

	public void clickQuestionsTab() {
		questionsTab.click();
	}
	
	public void clickfoulLanguageTab() {
		foulLanguageTab.click();
	}
	
	public void clickTranscriptTab() {
		transcriptTab.click();
	}
	
	public WebElement visibilityOfTranscript() {
		return transcript;
	}
	
	public void clickActionsTab() {
		actionsTab.click();	
	}
	
	public void clickFeedbackTab() {
		feedbackTab.click();
	}
	
	public void clickInsightsButton() {
		insightsButton.click();
	}
	
	public ActivityLogPage clickActivityLog() {
		activityLogLink.click();
		ActivityLogPage activityLogPage=new ActivityLogPage(driver);
		return activityLogPage;
	}
	}
