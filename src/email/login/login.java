package email.login;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//126邮箱登录,iframe跳转
public class login {
	
	@Test
	public void loginlogin(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.get("http://mail.126.com/");
		
		//定位并跳转到iframe
		//driver.switch_to.frame(mydriver.find_element_by_id('x-URS-iframe'))
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='x-URS-iframe']")));
		
		
		WebElement element;
	
		element=driver.findElement(By.xpath("//input[@class='j-inputtext dlemail']"));
		element.sendKeys("nbcb666");
		element=driver.findElement(By.xpath("//input[@class='j-inputtext dlpwd']"));
		element.sendKeys("nbcbnbcb");
		element=driver.findElement(By.id("dologin"));
		element.click();
		
		//通讯录
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		element=driver.findElement(By.xpath("//div[@id='dvMultiTab']/ul[@aria-label='邮箱标签']/li[@title='通讯录']"));
		element.click();
		
		//找到联系人个数（15）
		element= driver.findElement(By.xpath("//div[@class='js-component-component nui-tree-item-label nui-tree-item-label-selected']/span[3]"));
		//拆分（15），得到15
		System.out.print(element);
		
	}
//	@Test//(dependsOnMethods = {"loginlogin"})
//	public  void gerMailIsIn(){
//		int actuallinkmannum=0;//实际联系人个数
//		int pagenum=0;//联系人列表翻页的页码
//		
//		
//		
//		//得到（15）
//		
//		String strNum = element
//		//拆分，得到15 数值
//		
	//修改的内容 验证是否会上传
	//}
	

}
