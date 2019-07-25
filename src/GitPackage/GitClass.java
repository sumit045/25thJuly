package GitPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitClass {

	public static void main(String[] args) {
		
		System.out.println("This is for GIT");
		System.setProperty("webdriver.gecko.driver", "C:\\repo\\GitProject\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
	}

}
