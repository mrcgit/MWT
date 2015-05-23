package components;

import tags.HTMLTag;

public class Panel implements Component<HTMLTag>{
	private String id;
	private String height;
	private String width;
	private String cls;
	private String content;
	private Component<HTMLTag> child;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Component<HTMLTag> getChild() {
		return child;
	}

	public void setChild(Component component) {
		this.child = component;
		
	}


	public boolean hasChild() {
		return (this.child != null);
	}

	public HTMLTag getTag() {
		return HTMLTag.div;
	}

	

	

	

}
