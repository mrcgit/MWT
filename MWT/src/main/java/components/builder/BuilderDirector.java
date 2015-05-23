package components.builder;

public class BuilderDirector {

	public void make(AbstractTemplateBuilder builder) {
		builder.buildToolbar();
		builder.buildMenu();
		builder.buildBoard();
	}

}
