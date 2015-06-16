package Actions;

import org.openqa.selenium.WebDriver;

import Interfaces.Main_page;

public class Act_logout_railway_page {

	public static void Excute(WebDriver driver){
		
		//Click log out tab
		Main_page.tab_logout(driver).click();
	}
}
