package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Interfaces.Main_page;
import Interfaces.Myticket_page;

public class Act_cancel_all_ticket {

	public static void Excute(WebDriver driver) {
		// Open my ticket page
		Main_page.tab_myticket(driver).click();

		// Click first cancel button
		int count = getXpathCount(driver);
		if (count != 0) {
			for (int i = 1; i <= count; i++) {
				Myticket_page.btn_firstcancel(driver).click();
				driver.switchTo().alert().accept();
			}
		}
	}

	// Method to get Cancel button count
	private static int getXpathCount(WebDriver driver) {
		java.util.List<WebElement> count = driver.findElements(By
				.xpath(Myticket_page.xpath_cancelbutton));

		return count.size();
	}
}
