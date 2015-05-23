package components.builder;

import components.templates.Template;

public abstract class AbstractTemplateBuilder {
	public abstract void buildToolbar();

	public abstract void buildMenu();

	public abstract void buildBoard();

	public abstract Template getTemplate();
	

}
