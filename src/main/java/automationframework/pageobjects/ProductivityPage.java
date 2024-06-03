package automationframework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automationframework.AbstractComponents.AbstractComponent;

public class ProductivityPage extends AbstractComponent {
WebDriver driver;
	
	public ProductivityPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//h2[text()='Productivity']")
	WebElement productivityMainHeading;
	
	@FindBy(xpath="//button[text()='Data']")
	WebElement dataButton;
	
	@FindBy(xpath="//table[@role=\"table\"]/tbody/tr/td[1]")
	WebElement employeeId;
	
	@FindBy(xpath="//a[text()='Comparative Analysis']")
	WebElement comparativeAnalysis;
	
	public String productivityPageMainHeading() {
	       return productivityMainHeading.getText();	
	}
	
	public void clickDataButton() {
		dataButton.click();
	}
	
	public String getEmployeeeId() {
		return employeeId.getText();
	}
	
	public ComparativeAnalysisPage clickComparativeAnalysis() {
		comparativeAnalysis.click();
		ComparativeAnalysisPage comparativeAnalysisPage=new ComparativeAnalysisPage(driver);
		return comparativeAnalysisPage;
	}
	
}

