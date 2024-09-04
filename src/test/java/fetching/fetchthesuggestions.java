package fetching;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchthesuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.name("q")).sendKeys("hocolates");
List<WebElement> list = driver.findElements(By.xpath("//li[contains(.,'hocolate')]"));
for (WebElement e : list) {
	System.out.println(e.getText());
	
}
driver.quit();
	}

}
