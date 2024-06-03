package automationframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationframework.AbstractComponents.AbstractComponent;

public class ComparativeAnalysisPage extends AbstractComponent {
WebDriver driver;
	
	public ComparativeAnalysisPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h2[text()='Comparative Analysis']")
	WebElement comparativeAnalysisMainHeading;
	
	@FindBy(xpath="//a[text()='Duration Metrics']")
	WebElement durationMetrics;
	
	public String comparativeAnalysisPageMainHeading() {
		return comparativeAnalysisMainHeading.getText();
	}
	
	

}
