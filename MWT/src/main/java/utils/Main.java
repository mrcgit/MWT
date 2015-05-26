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

		AbstractView<?> view = new CustomView();
		view.init();
		view.setName("index");
		Template template = view.getTemplate();

		ObjectMapper mapper = new ObjectMapper();
		try {
			String resourcesPath = PropertiesUtil.getResourcesPath();
			StringBuilder sb = new StringBuilder();
			sb.append(resourcesPath).append(view.getName()).append(".json");
			mapper.writeValue(new File(sb.toString()), template);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}






}
