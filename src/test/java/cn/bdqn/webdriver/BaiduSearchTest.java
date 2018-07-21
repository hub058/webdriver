package cn.bdqn.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class BaiduSearchTest extends TestCase {

	@Test
	public void test1() {
		// 打开登陆页面
		System.setProperty("webdriver.chrome.driver",  "D:\\Program Files\\chromedriver\\chromedriver.exe");
		
		for (int i = 0; i < 10; i++) {
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8080/EasyBuy/Login?action=toLogin");
			driver.manage().window().maximize();

			CharSequence[] csName = new CharSequence[1];
			csName[0] = "admin";
			WebElement txtboxName = driver.findElement(By.name("loginName"));
			txtboxName.sendKeys(csName);
			
			CharSequence[] csPW = new CharSequence[1];
			csPW[0] = "123456";
			WebElement txtboxPW = driver.findElement(By.name("password"));
			txtboxPW.sendKeys(csPW);
			
			// 点击登录按钮
			WebElement btnLogin = driver.findElement(By.className("log_btn"));
			btnLogin.click();

			// 关闭WebDriver对象
			//driver.close();
		}
	}

}
