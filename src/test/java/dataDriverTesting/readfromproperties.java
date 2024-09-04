package dataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readfromproperties {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("./src/test/resources/data.properties");

		
		Properties property=new Properties();
		
		property.load(file);
		
		String browser=property.getProperty("browser");
		
		System.out.println(browser);
	}

}
