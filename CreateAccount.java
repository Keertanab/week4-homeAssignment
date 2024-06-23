package week1day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser
ChromeDriver driver = new ChromeDriver();

	//load the url
driver.get("http://leaftaps.com/opentaps/control/main");

//maximize the window
driver.manage().window().maximize();

//locate the username
WebElement usernameField = driver.findElement(By.id("username"));

//enter the username
usernameField.sendKeys("demosalesmanager");

//locate and enter the password
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");

//locate the login buton and click
driver.findElement(By.className("decorativeSubmit")).click();

//locate and click on CRM/SFA
driver.findElement(By.linkText("CRM/SFA")).click();

//locate and click accounts tab
driver.findElement(By.linkText("Accounts")).click();

//locate and click create account
driver.findElement(By.linkText("Create Account")).click();

//locate and enter the account name
driver.findElement(By.id("accountName")).sendKeys("Keertana TestLeaf");

//locate and enter  the description
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

//locate and enter the number of employees
driver.findElement(By.id("numberEmployees")).sendKeys("100");

//locate and enter the site name 
driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

//locate and click on the create account button
driver.findElement(By.className("smallSubmit")).click();

//get the title under TitleName
String TitleName = driver.getTitle();

//Print the title name
System.out.println("The title of page is : "+TitleName);

//check if the title is displayed correctly
if(TitleName.equals("Create Account | opentaps CRM"))
{
	System.out.println("The Title is displayed correctly");
	}
else
{
	System.out.println("The title is not displayed correctly");
	}

//make the window wait for 2S
Thread.sleep(2000);

//close the window
driver.close();






	
	

}

}



