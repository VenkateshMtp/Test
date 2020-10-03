package SeleniumAssigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
public class Login {

		static WebDriver wbdriver;
		@Test
		public  void LoginPage() {
		// TODO Auto-generated method stub
	
		
				String loginTitleExpected ="Leaftaps - TestLeaf Automation Platform", loginTitleActual;
				String labelExpected="Leaftaps Login", labelActual;
				
				wbdriver=SeleniumAssigments.drivers.browserSelection("Firefox");
				wbdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				// Login and verify
				wbdriver.get("http://leaftaps.com/opentaps/control/main");
				
				// Title Verification
				loginTitleActual =	wbdriver.getTitle();	
				Assert.assertEquals(loginTitleExpected, loginTitleActual);
			
				// Label Verification
				labelActual= wbdriver.findElement(By.xpath("//*[@id=\"form\"]/h2")).getText();
				System.out.println("Actual Label" +labelActual);
				Assert.assertEquals(labelExpected, labelActual);

				// Login page
				wbdriver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				wbdriver.findElement(By.id("password")).sendKeys("crmsfa");
				wbdriver.findElement(By.className("decorativeSubmit")).click();
				wbdriver.findElement(By.linkText("CRM/SFA")).click();
				
				// Create a new Lead
				
				wbdriver.findElement(By.linkText("Create Lead")).click();
				wbdriver.findElement(By.id("createLeadForm_companyName")).sendKeys("Easy Design System CBE");	
				wbdriver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkatesh");
				wbdriver.findElement(By.id("createLeadForm_lastName")).sendKeys("Krish");
				
				// Selecting source from list box
				Select sourceSelect = new Select(wbdriver.findElement(By.id("createLeadForm_dataSourceId")));
				sourceSelect.selectByIndex(5);
				
				// Selecting Marketing Campaign from list box
				Select mktCampSelect = new Select(wbdriver.findElement(By.id("createLeadForm_marketingCampaignId")));
				mktCampSelect.selectByVisibleText("Catalog Generating Marketing Campaigns");
				
				wbdriver.findElement(By.className("smallSubmit")).click();
				
				
		}
		
		
			
	}


