package utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
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
	
	
	
	public static String getResourcesPath(){
		URL resource = PropertiesUtil.class.getClassLoader().getResource("config.properties");
		String path = resource.getPath().split("config.properties")[0];
		return path;
	}
	

	
	

}
