package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlechrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SelWD\\Drvers\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		System.out.println("running with chrome");
	}

}
