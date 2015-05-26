package views;

import components.Panel;
import components.templates.Template;

public class CustomView extends DefaultView{

	@Override
	public void init() {
		super.init();
		Template template = getTemplate();
		Panel panel = new Panel();
		panel.setCls("elegant");
		panel.setContent("<h2>My toolbar</h2>");
		template.getToolbar().setChild(panel);
		
		Panel panel2 = new Panel();
		panel2.setContent("<div>Questo è un pannello annidato</div>");
		panel.setChild(panel2);
		
		Panel panel3 = new Panel();
		panel3.setWidth("300px");
		panel3.setHeight("300px");
		panel3.setContent("Il contenuto del pannello 3");
		template.getBoard().setChild(panel3);
		
	}




	

}
