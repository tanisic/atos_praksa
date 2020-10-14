package hr.atos.praksa.tinanisic.zadatak11;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class English implements ILanguage{

	private PropertiesLoad loader;
	private Properties propertyLoad;
	
	public English() {
		loader = PropertiesLoad.getInstance(System.getProperty("user.dir")+"\\src\\hr\\atos\\praksa"
				+ "\\tinanisic\\zadatak11\\english.properties");
		try {
			propertyLoad = loader.getProperty();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void interact() {
		UserInfo user = new UserInfo();
		Scanner scan = new Scanner(System.in);
		System.out.println(propertyLoad.getProperty("introduction"));
		System.out.println(propertyLoad.getProperty("name"));
		user.setFirstName(scan.nextLine());
		System.out.println(propertyLoad.getProperty("surname"));
		user.setLastName(scan.nextLine());
		System.out.println(propertyLoad.getProperty("address"));
		user.setAddress(scan.nextLine());
		
		
	}

}
