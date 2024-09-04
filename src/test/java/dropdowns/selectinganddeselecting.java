package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectinganddeselecting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement alldropdown = driver.findElement(By.id("cars"));
		Select options=new Select(alldropdown);
		System.out.println("******************DROP DOWN ELEMENTS*******************");
		List<WebElement> alloptions = options.getOptions();
		for (WebElement opt : alloptions) {
			System.out.println(opt.getText());
			
		}
		options.selectByValue("90");
		options.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		options.selectByIndex(0);
		System.out.println("**************SELECTED OPTIONS***********");
List<WebElement> selectoptions = options.getAllSelectedOptions();
for (WebElement w : selectoptions) {
	System.out.println(w.getText());
}
System.out.println("first selected option "+options.getFirstSelectedOption());
if(options.isMultiple())
{
	/*options.selectByValue("90");
	options.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
	options.selectByIndex(0);*/
	options.deselectAll();
}
driver.quit();
	}

}
