package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertsleafgrounds {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//i[contains(@class,'layout-menuitem-icon')])[4]")).click();
		driver.findElement(By.xpath("(//i[contains(@class,'layout-menuitem-icon')])[5]")).click();
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		String simpleAlertText = alert.getText();
		System.out.println(simpleAlertText);
		alert.accept();
		System.out.println("-------");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmAlert = driver.switchTo().alert();
		String confirmAlertText = confirmAlert.getText();
		System.out.println(confirmAlertText);
		alert.accept();
		System.out.println("-------");
		
		String confirmAlertOK=driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(confirmAlertOK);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmAlert2 = driver.switchTo().alert();
		String confirmAlertText2 = confirmAlert2.getText();
		System.out.println(confirmAlertText2);
		alert.dismiss();
		System.out.println("-------");
		
		String confirmAlertDismiss=driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(confirmAlertDismiss);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		System.out.println("Below is the content in Sweet Alert");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'dialog that can be inspectable')]")).getText());
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		System.out.println("-------");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		System.out.println("Below is the content in Sweet Model Dialogue");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Unless you close this')]")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[2]")).click();
		System.out.println("-------");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		System.out.println("Below is the content in Alert (Prompt Dialog)");
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Poornima");
		alert.accept();
			System.out.println(driver.findElement(By.xpath("(//span[@id='confirm_result'])")).getText());
		System.out.println("-------");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h5[text()='Minimize and Maximize']//following-sibling::button")).click();
		System.out.println("Below is the content in Alert Minimize and Maximize");
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'I am Sweet Alert and can be maximized')]")).getText());
		Thread.sleep(1000);
				driver.findElement(By.xpath("//a[contains(@class,'maximize ui-corner-all')]//span")).click();
				Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'minimize ui-corner-all')]")).click();
		System.out.println("-------");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		System.out.println("Sweet Alert (Confirmation)");
		System.out.println(driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText());
		driver.findElement(By.xpath("(//button[contains(@class,'ui-button-secondary')])[2]")).click();
		
		
	
	
		
		
		
	}

}
