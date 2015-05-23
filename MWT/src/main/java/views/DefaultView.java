package views;

import components.builder.AbstractTemplateBuilder;
import components.builder.DefaultTemplateBuilder;

public class DefaultView extends AbstractView {
	AbstractTemplateBuilder builder = new DefaultTemplateBuilder();
	
	public void init(){
		useTemplate(builder);
		instanceTemplate();
	
	}
	


	
	
}
