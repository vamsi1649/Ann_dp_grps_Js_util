package TestNGDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationsOfJunit {
	WebDriver driver;
	public String Title;
	public String Url="www.google.com";
	
@Before
public void BT()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(Url);
		
}
@Test
public void testcase1()
{
	Title = driver.getTitle();
	
}
@Test
public void testcase2()
{
	Title = driver.getCurrentUrl();
	
}
@After
public void AT()
{	
	driver.close();
}

}
