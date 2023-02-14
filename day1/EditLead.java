package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("INFOTECH");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("muthulakshmi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Validation checked");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("muthulakshmi2599@gmail.com");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).click();
		Select stateDropDown=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		stateDropDown.selectByVisibleText("New York");
		//WebElement stateDD=driver.findElement(By.name("createLeadForm_generalStateProvinceGeoId"));
		//Select DD = new Select(stateDD);
		//DD.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();	
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Validation checked with all test cases");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		

	}

}
