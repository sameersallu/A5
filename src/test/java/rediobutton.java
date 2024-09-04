import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediobutton {
	static WebDriver driver=new ChromeDriver();
public static void m1() throws InterruptedException {

}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().fullscreen();
		 driver.findElement(By.xpath("//*[name()='svg'and @stroke=\"currentColor\"]")).click();
		
		
		driver.findElement(By.xpath("//a/section[text()=\"Radio Button\"]")).click();
		driver.findElement(By.xpath("//li/a[text()='Default']")).click();
		driver.findElement(By.xpath("(//input[@value='Upi'])")).click();
		driver.findElement(By.xpath("(//input[@value='office'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Continue\"]")).submit();
		Thread.sleep(3000);
driver.findElement(By.xpath("//a[text()=\"Selected\"]"));
	}

}
