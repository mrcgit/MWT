package components.templates;

import tags.HTMLTag;
import components.Component;
import components.Panel;

public class Template {
	private Component<HTMLTag> toolbar;
	private Component<HTMLTag> menu;
	private Component<HTMLTag> board;
	
	public Component<HTMLTag> getToolbar() {
		return toolbar;
	}
	public void setToolbar(Component<HTMLTag> toolbar) {
		this.toolbar = toolbar;
	}
	public Component<HTMLTag> getMenu() {
		return this.menu;
	}
	public void setMenu(Component<HTMLTag> menu) {
		this.menu = menu;
	}
	public Component<HTMLTag> getBoard() {
		return this.board;
	}
	public void setBoard(Component<HTMLTag>  board) {
		this.board = board;
	}
	
	

}
