package Actions;

import org.openqa.selenium.WebDriver;

public class Act_open_railway_page {

	public static void Excute(WebDriver driver) {
		driver.get(Constant.railway_url);
		driver.manage().window().maximize();
	}
}
