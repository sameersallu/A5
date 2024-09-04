package qspider.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseactions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.amazon.in/");
WebElement searchfild = driver.findElement(By.id("twotabsearchtextbox"));
WebElement searchbut = driver.findElement(By.id("nav-search-submit-button"));
Actions actions=new Actions(driver);
actions.keyDown(Keys.SHIFT).sendKeys(searchfild,"wallets").keyUp(Keys.SHIFT).click(searchbut).build().perform();
Thread.sleep(3000);
driver.quit();
    }

}
