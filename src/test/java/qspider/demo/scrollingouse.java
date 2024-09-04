package qspider.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollingouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement singin = driver.findElement(By.xpath("(//span[contains(text(),\"Sign in\")])[3]"));
		Actions actions=new Actions(driver);
		actions.scrollToElement(singin).perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
