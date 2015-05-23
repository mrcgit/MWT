package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
	
	public static Properties getProperties(){
		
		Properties prop = new Properties();
		InputStream input = null;
	 
			String filename = "config.properties";
			input = PropertiesUtil.class.getClassLoader().getResourceAsStream(filename);
			try {
				prop.load(input);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		return prop;
		
	}
	
	

}
