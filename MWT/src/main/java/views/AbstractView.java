package views;

import presenters.Presenter;
import components.builder.AbstractTemplateBuilder;
import components.builder.TemplateBuildDirector;
import components.templates.Template;

public abstract class AbstractView<E extends Presenter> {

	private Presenter presenter;
	private AbstractTemplateBuilder builder;
	private Template template;
	private String name;
	//

	public abstract void init();


	/**
	 * Instances a new Template
	 */
	protected void instanceTemplate(){
		AbstractTemplateBuilder builder = getBuilder();
		TemplateBuildDirector director = new TemplateBuildDirector();
		director.make(builder);
		Template template = builder.getTemplate();
		setTemplate(template);
	}

	/**
	 * 
	 * @param builder the Template builder
	 */
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


	public Presenter getPresenter() {
		return presenter;
	}


	public void setPresenter(Presenter p) {
		this.presenter = p;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	







}
