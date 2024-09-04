package check;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.swiggy.com/");
driver.manage().window().fullscreen();
Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement file = driver.findElement(By.xpath("//main[@id='seo-core-layout']"));
File src = file.getScreenshotAs(OutputType.FILE);
File dest = new File("./Screenshots/swigy.png");
FileUtils.copyFile(src, dest);
driver.quit();
	}

}
