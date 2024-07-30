
package automationfc.com;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test1 {
	public WebDriver driver;	
	
	@BeforeMethod
	  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64-2\\chromedriver-win64\\chromedriver.exe");   
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.calculator.net/random-number-generator.html");
	  }
	  @Test
	  public void main() throws InterruptedException {
		  Thread.sleep(1000);
		  String a[] = {"1","2","3","4","5"};
		  String b[] = {"6","7","8","9","10"};
		  for(int i = 0; i <5; i++) {
			  driver.findElement(By.name("slower")).click();
			  driver.findElement(By.name("slower")).clear();
			  driver.findElement(By.name("slower")).sendKeys(a[i]);
			  driver.findElement(By.name("supper")).click();
			  driver.findElement(By.name("supper")).clear();
			  driver.findElement(By.name("supper")).sendKeys(b[i]);;
			  driver.findElement(By.xpath("//input[@value='Generate']")).click();
		  }
		  System.out.println("OK");
	  }
	 
	  @AfterMethod
	  public void afterMethod() {
		 //driver.quit();
	  }
}