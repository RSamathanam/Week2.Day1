package week2.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.*;

public class CreateLead  {


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	//	driver.get("https://www.google.com/");
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		System.out.println("title :"+ title);
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		WebElement clkbtn = driver.findElement(By.className("decorativeSubmit"));
		clkbtn.click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompanyName1");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName f");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName 2");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Joshua");	
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Value for Title");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1234567");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("SC2134");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description value for testing");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Importance Note value for testing");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Last Name local value");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/05/2012");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Value for departmentName");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("TC001");
		WebElement clrtext = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				clrtext.clear();
				clrtext.sendKeys("Description value for testing");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("41");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pitchumani@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("24456783");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("98345627162");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.pitchumani.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Value for To Name");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("address line 1 testing");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600129");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("129");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Name of attention");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("address line 2 testing");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alaska");
		
		
		driver.findElement(By.className("smallSubmit")).click();
		String title2 = driver.getTitle();
		System.out.println("2nd Page Title is :"+ title2);
		
		String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		System.out.println("Page name : " + text);
		String txttemp = text;
		
		if (text == txttemp) {
			System.out.println("View Lead Page Successfully Displayed");
			}
			else {
				System.out.println("View Lead Page Not Displayed");
			}
	
		driver.findElement(By.linkText("Logout")).click();
		
		
	driver.close();

	}
}

