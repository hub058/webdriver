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
public class AppTest extends TestCase {

	@Test
	public void test1() {
		// 打开登陆页面
		System.setProperty("webdriver.chrome.driver",  "D:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://pan.baidu.com/");
		driver.manage().window().maximize();
		
		// 点击账号密码登录
		WebElement btnUserPassLogin = driver.findElement(By.id("TANGRAM__PSP_4__footerULoginBtn"));
		btnUserPassLogin.click();

		// 输入用户密码
		CharSequence[] csUser = new CharSequence[1];
		csUser[0] = "du0114";
		WebElement txtboxUser = driver.findElement(By.name("userName"));
		txtboxUser.sendKeys(csUser);

		CharSequence[] csPW = new CharSequence[1];
		csPW[0] = "endong999";
		WebElement txtboxPW = driver.findElement(By.name("password"));
		txtboxPW.sendKeys(csPW);
		
		// 点击登录按钮
		WebElement btnLogin = driver.findElement(By.id("TANGRAM__PSP_4__submit"));
		btnLogin.click();

		// 关闭WebDriver对象
		driver.close();
	}

}
