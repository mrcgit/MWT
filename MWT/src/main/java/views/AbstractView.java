package views;

import components.builder.AbstractTemplateBuilder;
import components.builder.TemplateBuildDirector;
import components.templates.Template;

public abstract class AbstractView {
	private AbstractTemplateBuilder builder;
	private Template template;
	
	public abstract void init();


/**
 * Instances a new Template using a
 */
	protected void instanceTemplate(){
		AbstractTemplateBuilder builder = getBuilder();
		TemplateBuildDirector director = new TemplateBuildDirector();
		director.make(builder);
		Template template = builder.getTemplate();
		setTemplate(template);
	}
	
	protected void useTemplate(AbstractTemplateBuilder builder){
		setBuilder(builder);
	}


	public Template getTemplate() {
		return template;
	}


	public void setTemplate(Template template) {
		this.template = template;
	}



	public AbstractTemplateBuilder getBuilder() {
		return builder;
	}



	private void setBuilder(AbstractTemplateBuilder builder) {
		this.builder = builder;
	}








}
