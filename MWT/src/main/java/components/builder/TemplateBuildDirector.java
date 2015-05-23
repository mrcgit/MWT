package components.builder;

public class TemplateBuildDirector {

	public void make(AbstractTemplateBuilder builder) {
		builder.buildToolbar();
		builder.buildMenu();
		builder.buildBoard();
	}

}
