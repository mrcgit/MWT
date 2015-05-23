package components.builder;

import components.Panel;
import components.templates.Template;

public class TemplateBuilder extends AbstractTemplateBuilder {
	Template template = new Template();

	@Override
	public void buildToolbar() {
		Panel toolbar = new Panel();
		template.setBoard(toolbar);
		
	}

	@Override
	public void buildMenu() {
		Panel menu = new Panel();
		template.setMenu(menu);
	}

	@Override
	public void buildBoard() {
		Panel board = new Panel();
		template.setBoard(board);
	}

	@Override
	public Template getTemplate() {
		return template;
	}

}
