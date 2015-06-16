package Actions;

import java.util.Random;

public class Constant {
	static Random ran = new Random();
	static int number = ran.nextInt(100000);

	public static final String railway_url = "http://logton3.sitecloud.cytanium.com";
	public static final String mailinator_url = "http://mailinator.com/";
	public static final String randomemail = "tanvo" + number
			+ "@mailinator.com";
	public static final String email = "tan123456789@mailinator.com";
	
	public static final String firstname = "tan";
	public static final String lastname = "vo";
	public static final String address = "12 Ly Thuong Kiet";
	public static final String city = "Da Nang";
	public static final String province = "Quang Nam";
	public static final String phone = "1234567890";
	public static final String password = "123456789";
	public static final String pid = "123456789";
	public static final String departStation1 = "Phan Thiết";
	public static final String departStation2 = "Nha Trang";
	public static final String arriveStation1 = "Nha Trang";
	public static final String arriveStation2 = "Đà Nẵng";
	public static final String seatType = "Soft bed";
	public static final String ticketAmount = "2";
}
