import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Deepthi\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.yahoo.com/");

//1. id
driver.findElement(By.className("_yb_1iena")).click();
WebElement username = driver.findElement(By.id("login-username"));
username.sendKeys("testnaveen@yahoo.com");
WebElement nextButton = driver.findElement(By.id("login-signin"));
nextButton.click();
System.out.println("Test");
System.out.println("try again");
	}

}
