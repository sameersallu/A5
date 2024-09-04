import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;




public class mouseactions extends rediobutton{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();

driver.get("https://demoapps.qspiders.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().fullscreen();
 driver.findElement(By.xpath("//*[name()='svg'and @stroke=\"currentColor\"]")).click();
 Thread.sleep(3000);
driver.findElement(By.xpath("//a/section[text()=\"Button\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()=\"Default Click\"]")).click();
Thread.sleep(3000);
 driver.findElement(By.xpath("//button[text()=\"Yes\"]")).click();
 driver.findElement(By.xpath("(//button[text()='Yes'])[2]")).click();
 driver.findElement(By.xpath("//button[text()=\"4\"]")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//a[text()=\"Right Click\"]")).click();


	WebElement cli = driver.findElement(By.xpath("//button[text()=\"Right Click\"]"));
	Actions action =new Actions(driver);
	action.contextClick(cli).perform();
	driver.findElement(By.xpath("//div[text()=\"Yes\"]")).click();
	
	WebElement clik = driver.findElement(By.xpath("(//button[text()=\"Right Click\"])[2]"));
	Actions actionss =new Actions(driver);
	actionss.contextClick(clik).perform();
	driver.findElement(By.xpath("//div[text()=\"Yes\"]")).click();
	
	WebElement clit = driver.findElement(By.xpath("(//button[text()=\"Right Click\"])[3]"));
	Actions actions =new Actions(driver);
	actions.contextClick(clit).perform();
	driver.findElement(By.xpath("//div[text()=\"2\"]")).click();
	
	Thread.sleep(3000);
	

driver.findElement(By.xpath("//a[text()=\"Double Click\"]")).click();
WebElement e1 = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
Actions a1=new Actions(driver);
a1.doubleClick(e1).perform();

 WebElement e2 = driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
 Actions a2=new Actions(driver);
 a2.doubleClick(e2).perform();
WebElement e3 = driver.findElement(By.xpath("//button[text()=\"4\"]"));
Actions a3=new Actions(driver);
a3.doubleClick(e3).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()=\"Submit Click\"]")).click();

 driver.findElement(By.xpath("(//input[@value='Yes'])[1]")).click();
driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).submit();

driver.findElement(By.xpath("(//input[@value='Yes'])[2]")).click();
driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).submit();
driver.findElement(By.xpath("(//input[@value='4'])")).click();
driver.findElement(By.xpath("(//button[text()='Submit'])[3]")).submit();
Thread.sleep(3000);





	}

}
