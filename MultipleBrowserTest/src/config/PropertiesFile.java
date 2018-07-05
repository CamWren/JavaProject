package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import multiplebrowsers.thebigtest;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
		
	} 

	public static void readPropertiesFile() {
		
		try {
			InputStream input = new FileInputStream("C:\\JavaProjects\\MultipleBrowserTest\\src\\config\\config.properties");
			prop.load(input);
			thebigtest.browser = prop.getProperty("browser");
			System.out.println(thebigtest.browser);
		
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void writePropertiesFile() {
		
		try {
			OutputStream output = new FileOutputStream("C:\\JavaProjects\\MultipleBrowserTest\\src\\config\\config.properties");
			prop.setProperty("browser", "Chrome");
			prop.setProperty("result", "pass");
			prop.store(output, null);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
		
}
