package utils;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import views.AbstractView;
import views.CustomView;

import components.templates.Template;


public class Main {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException{
		
		AbstractView view = new CustomView();
		view.init();
		Template template = view.getTemplate();
		
		String CustomTreePath = PropertiesUtil.getProperties().getProperty("CustomTreePath");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(CustomTreePath), template);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	

	
	
	
}
