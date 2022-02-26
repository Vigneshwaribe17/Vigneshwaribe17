package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2Assignment3 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	    driver.manage().window().maximize();
	    WebElement elementusername = driver.findElement(By.id("username"));
	    elementusername.sendKeys("DemosalesManager");
	    WebElement elementpassword = driver.findElement(By.id("password"));
	    elementpassword.sendKeys("crmsfa");
	    WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	    elementLogin.click();
	    WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	    elementCRMSFA.click();
	    WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	    elementLeads.click();
	    WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
	    elementCreateLead.click();
	    WebElement elementCompanyName = driver.findElement(By.className("inputBox"));
	    elementCompanyName.sendKeys("Wipro");
	    WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
	    elementFirstName.sendKeys("Vigneshwari");
	    WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
	    elementLastName.sendKeys("K");
	   
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vicky");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	    
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Learning");
	    
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
	    
	    WebElement elementDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    Select dd = new Select(elementDropdown);
	    dd.selectByVisibleText("New York");

	    WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
	    elementCreateLeadButton.click();
	    
	    driver.getTitle();
	    System.out.println(driver.getTitle());
	    
	    
	    driver.findElement(By.linkText("Duplicate Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AON");
	    
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vicky");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    
	    System.out.println(driver.getTitle());
	    
	}


}
