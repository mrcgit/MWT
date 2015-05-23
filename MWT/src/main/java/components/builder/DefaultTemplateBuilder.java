package components.builder;

import components.Panel;
import components.templates.Template;

public class DefaultTemplateBuilder extends AbstractTemplateBuilder {
	Template template = new Template();

	@Override
	public void buildToolbar() {
		Panel toolbar = new Panel();
		toolbar.setCls("default-toolbar");
		template.setToolbar(toolbar);
		
	}

	@Override
	public void buildMenu() {
		Panel menu = new Panel();
		menu.setCls("default-menu");
		template.setMenu(menu);
	}

	@Override
	public void buildBoard() {
		Panel board = new Panel();
		board.setCls("default-board");
		template.setBoard(board);
	}

	@Override
	public Template getTemplate() {
		return template;
	}

}
