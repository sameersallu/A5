package Roberclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handilingdropdownrobert {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.ebay.com/k--------------+");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("gh-cat")).click();
List<WebElement> options = driver.findElements(By.tagName("//option"));
 Robot r=new Robot();
 for (WebElement option : options) {
if(option.getText().equals("Business & Industrial"))
{
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	break;
}
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

 }
 Thread.sleep(2000);
 driver.quit();
	}

}
