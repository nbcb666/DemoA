package email.login;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//126�����¼,iframe��ת
public class login {
	
	@Test
	public void loginlogin(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.get("http://mail.126.com/");
		
		//��λ����ת��iframe
		//driver.switch_to.frame(mydriver.find_element_by_id('x-URS-iframe'))
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='x-URS-iframe']")));
		
		
		WebElement element;
	
		element=driver.findElement(By.xpath("//input[@class='j-inputtext dlemail']"));
		element.sendKeys("nbcb666");
		element=driver.findElement(By.xpath("//input[@class='j-inputtext dlpwd']"));
		element.sendKeys("nbcbnbcb");
		element=driver.findElement(By.id("dologin"));
		element.click();
		
		//ͨѶ¼
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		element=driver.findElement(By.xpath("//div[@id='dvMultiTab']/ul[@aria-label='�����ǩ']/li[@title='ͨѶ¼']"));
		element.click();
		
		//�ҵ���ϵ�˸�����15��
		element= driver.findElement(By.xpath("//div[@class='js-component-component nui-tree-item-label nui-tree-item-label-selected']/span[3]"));
		//��֣�15�����õ�15
		System.out.print(element);
		
	}
//	@Test//(dependsOnMethods = {"loginlogin"})
//	public  void gerMailIsIn(){
//		int actuallinkmannum=0;//ʵ����ϵ�˸���
//		int pagenum=0;//��ϵ���б�ҳ��ҳ��
//		
//		
//		
//		//�õ���15��
//		
//		String strNum = element
//		//��֣��õ�15 ��ֵ
//		
	//�޸ĵ����� ��֤�Ƿ���ϴ�
	//}
	

}
