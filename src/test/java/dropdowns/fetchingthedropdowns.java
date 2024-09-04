package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fetchingthedropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
WebElement alldropdown = driver.findElement(By.id("searchDropdownBox"));
Select options=new Select(alldropdown);
options.selectByIndex(11);
options.selectByValue("search-alias=shoes");
Thread.sleep(3000);
options.selectByVisibleText("Toys & Games");
Thread.sleep(3000);

List<WebElement> alloptionms = options.getOptions();
for (WebElement opt : alloptionms) {
	System.out.println(opt.getText());
}
if(options.isMultiple())
	System.out.println("it is multiselect");
else
	System.out.println("it is single select");
driver.quit();

	
	
		
	}
}
