package TestNGDemo;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataprovider {
	
  public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
  WebDriver driver;
  
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  
	 Thread.sleep(5000);  
	 driver.findElement(By.name("username")).sendKeys(n);
	 driver.findElement(By.name("password")).sendKeys(s);
	 driver.findElement(By.xpath("//*[@type='submit']")).click(); 
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	 Thread.sleep(5000);
	 }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get(url);
	  Thread.sleep(5000);
  }
}
