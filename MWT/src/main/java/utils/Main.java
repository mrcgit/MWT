package utils;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import views.AbstractView;
import views.FirstView;

import components.templates.Template;


public class Main {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException{
		
		AbstractView view = new FirstView();
		view.init();
		Template template = view.getTemplate();
		
		String resourcePath = PropertiesUtil.getProperties().getProperty("ResourcePath");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(resourcePath), template);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	

	
	
	
}
