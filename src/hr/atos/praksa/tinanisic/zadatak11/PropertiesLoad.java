package hr.atos.praksa.tinanisic.zadatak11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoad {
	
	private String propertyName;
	private static PropertiesLoad instance;
	
	private PropertiesLoad(String propertyName) {
		this.propertyName = propertyName;
	}
	public static PropertiesLoad getInstance(String propertyName) {
		if(instance == null) {
			instance = new PropertiesLoad(propertyName);
		}
		return instance;
	}
	public Properties getProperty() throws IOException {
		Properties properties = new Properties();
		FileInputStream input = new FileInputStream(propertyName);
		properties.load(input);
		return properties;
	}
}
