package Actions;

import org.openqa.selenium.WebDriver;

import Interfaces.Mailinator_page;

public class Act_open_mailinatorbox {

	public static void Excute(WebDriver driver, String _mail) {

		// Navigate to mailinator
		driver.navigate().to(Constant.mailinator_url);

		// Input mail
		Mailinator_page.txt_mail(driver).clear();
		Mailinator_page.txt_mail(driver).sendKeys(_mail);

		// Click Check button
		Mailinator_page.btn_check(driver).click();
		
		//Click confirm link
		ClickActiveLink(driver);
	}

	public static void ClickActiveLink(WebDriver driver) {

		// Open inbox
		Mailinator_page.lnk_subjectmail(driver).click();

		// Switch to iframe
		driver.switchTo().frame(Mailinator_page.iframe(driver));

		// Click active link
		Mailinator_page.lnk_confirm(driver).click();
	}

}
