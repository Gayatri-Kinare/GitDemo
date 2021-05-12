package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Vaibhav Teli\\eclipse-workspace\\Automation\\src\\test\\java\\Cucumber\\Automation\\global.properties");
		prop.load(fis);
		prop.getProperty("url");
		WebDriverManager.firefoxdriver().setup();
    	driver=new FirefoxDriver();
    	driver.get(prop.getProperty("url"));
    	
    	return driver;
    
	}
}
