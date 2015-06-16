package Actions;

import org.openqa.selenium.WebDriver;

import Interfaces.Main_page;
import Interfaces.Register_page;

public class Act_sign_up_railway_page {

	public static void Excute(WebDriver driver, String _firstname,
			String _lastname, String _add, String _city, String _provi,
			String _mail, String _pass, String _confimpass, String _pid, String _phone) {
		
		//Open register page
		Main_page.tab_register(driver).click();
		
		//Input first name
		if(_firstname!=""){
			Register_page.txt_firstname(driver).clear();
			Register_page.txt_firstname(driver).sendKeys(_firstname);
		}
		
		//Input last name
		if(_lastname!=""){
			Register_page.txt_lastname(driver).clear();
			Register_page.txt_lastname(driver).sendKeys(_lastname);
		}
		
		//Input address
		if (_add!=""){
			Register_page.txt_address(driver).clear();
			Register_page.txt_address(driver).sendKeys(_add);
		}
		
		//Input city
		if(_city!=""){
			Register_page.txt_city(driver).clear();
			Register_page.txt_city(driver).sendKeys(_city);
		}
		
		//Input province
		if(_provi!=""){
			Register_page.txt_province(driver).clear();
			Register_page.txt_province(driver).sendKeys(_provi);
		}
		
		
		//Input email
		if(_mail!=""){
			Register_page.txt_mail(driver).clear();
			Register_page.txt_mail(driver).sendKeys(_mail);
		}
		
		//Input password
		if(_pass!=""){
			Register_page.txt_password(driver).clear();
			Register_page.txt_password(driver).sendKeys(_pass);
		}
		
		//Input confirm password
		if(_confimpass!=""){
			Register_page.txt_confirmpass(driver).clear();
			Register_page.txt_confirmpass(driver).sendKeys(_confimpass);
		}
		
		//Input passport
		if(_pid!=""){
			Register_page.txt_pid(driver).clear();
			Register_page.txt_pid(driver).sendKeys(_pid);
		}
		
		//Input phone number
		if(_phone!=""){
			Register_page.txt_phone(driver).clear();
			Register_page.txt_phone(driver).sendKeys(_phone);
		}
		
		//Click Register button
		Register_page.btn_register(driver).click();
	}
}
