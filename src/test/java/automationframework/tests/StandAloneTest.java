package automationframework.tests;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import automationframework.pageobjects.LoginPage;
public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://65.108.148.94/login");
		LoginPage loginpage=new LoginPage(driver);
		driver.findElement(By.id("inputEmail")).sendKeys("admin@Insurancedekho.com");
		driver.findElement(By.id("inputChoosePassword")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()=' Sign in']")).click();
        String dashboardMainHeading=driver.findElement(By.xpath("//h3[text()='Insurance dekho']")).getText();
        Assert.assertEquals(dashboardMainHeading,"Insurance dekho");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[contains(@class,'bx-filter-alt')]")).click();
        WebElement staticDropdown1=driver.findElement(By.xpath("(//select[@as=\"select\"])[2]"));
        Select coeDropdown=new Select(staticDropdown1);
        coeDropdown.selectByVisibleText("GURGAON(Fusion)");
        WebElement staticDropdown2=driver.findElement(By.xpath("(//select[@as=\"select\"])[3]"));
        Select dateDropdown=new Select(staticDropdown2);
        dateDropdown.selectByVisibleText(" Last Month");
        driver.findElement(By.xpath("//button[text()='Apply']")).click();
	}

}
