package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Interfaces.Main_page;
import Interfaces.Myticket_page;

public class Act_cancel_ticket {

	public static void Excute(WebDriver driver, String _depart, String _arrive){
		
		//Open my ticket page
		Main_page.tab_myticket(driver).click();
		
		//Cancel ticket
		int count = getXpathCount(driver);
		int j=0;
		if(count!=0){
			for(int i=1;i<=count;i++){
				j= i+1;
				String depart = driver.findElement(By.xpath("//table/tbody/tr["+j+"]/td[2]")).getText();	
				String arrive = driver.findElement(By.xpath("//table/tbody/tr["+j+"]/td[3]")).getText();
				
				if(depart.equals(_depart) && arrive.equals(arrive)){
						driver.findElement(By.xpath("//table/tbody/tr["+j+"]/td[13]/input[@value='Cancel']")).click();
						driver.switchTo().alert().accept();
						break;
				}
			}
		}
	}
	
	private static int getXpathCount(WebDriver driver){
		java.util.List<WebElement> count = driver.findElements(By.xpath(Myticket_page.xpath_cancelbutton));
		return count.size();
	}
}
