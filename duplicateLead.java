package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class duplicateLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
         driver.manage().window().maximize();
         driver.findElement(By.id("username")).sendKeys("demoSalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         String title = driver.getTitle();
         System.out.println(title);
         driver.findElement(By.linkText("CRM/SFA")).click();        
         driver.findElement(By.linkText("Leads")).click();
         String title1 = driver.getTitle();
         System.out.println(title1);         
         driver.findElement(By.linkText("Create Lead")).click();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Walmart");
         WebElement sourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
         Select choose=new Select(sourceId);
         choose.selectByIndex(3);
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravanan");
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kannappan");
         driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saravanan");
         driver.findElement(By.className("inputBox")).sendKeys("BPO");
         driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BPO");
         driver.findElement(By.id("createLeadForm_description")).sendKeys("To create Leads");
         driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sarvananmdu@gmail.com");
         WebElement StateId = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
         Select state=new Select(StateId);
         state.selectByVisibleText("New York");
         driver.findElement(By.className("smallSubmit")).click();
         String title2 = driver.getTitle();
         System.out.println(title2); 
         driver.findElement(By.linkText("Duplicate Lead")).click();
         WebElement Company = driver.findElement(By.id("createLeadForm_companyName"));
         Company.clear();
         Company.sendKeys("Solartis");
         WebElement Fname = driver.findElement(By.id("createLeadForm_firstName"));
         Fname.clear();
         Fname.sendKeys("Sara");
         driver.findElement(By.className("smallSubmit")).click();
         String title4 = driver.getTitle();
         System.out.println(title4);
         
}

}