package yahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

public class Compose extends MainClass implements UserAccount
{
  
  public void sendmail() throws Exception
  {
	  driver.findElement(By.xpath("//input[@class='composeicon']")).click();
	  Thread.sleep(3000);
	  try
	  {
		  if(driver.findElement(By.id("to")).isDisplayed())
		  {
			    log=ext.createTest("passTest");
				log.log(Status.PASS, "Compose is displayed");
				takescreenshot(imagepath+"Compose_page.png");
				log.addScreenCaptureFromPath(imagepath+"compose_page.png");	
				
		  }
	  }
	  catch(Exception e)
	  {
		    log=ext.createTest("failTest");
			log.log(Status.FAIL, "Compose NOT displayed");
			takescreenshot(imagepath+"Compose_page.png");
			log.addScreenCaptureFromPath(imagepath+"compose_page.png");	
			 
	  }
	 
	  
	  driver.findElement(to).sendKeys("abcd@gmail.com");
	  driver.findElement(subject).sendKeys("hello");
	  driver.findElement(body).sendKeys("this is sample mail");
	  driver.findElement(sendbutton).click();
	  
  }
  public void signout() throws Exception
  {
	  driver.findElement(By.linkText("Sign Out")).click();
	  driver.close();
	  
  }
}
