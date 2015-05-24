package views;

import presenters.Presenter;
import components.builder.AbstractTemplateBuilder;
import components.builder.DefaultTemplateBuilder;

public class DefaultView extends AbstractView<Presenter> {
	AbstractTemplateBuilder builder = new DefaultTemplateBuilder();
	
	public void init(){
		useTemplate(builder);
		instanceTemplate();
	
	}
	


	
	
}
