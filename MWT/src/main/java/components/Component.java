package components;

import tags.HTMLTag;

public interface Component<E extends Enum<HTMLTag>> {

	public Component<?> getChild();

	public void setChild(Component<?> component);
	
	public boolean hasChild();

	public String getId();

	public void setId(String id);

	public String getHeight();

	public void setHeight(String height);

	public String getWidth();

	public void setWidth(String width);

	public String getCls();

	public void setCls(String cls);

	public String getContent();

	public void setContent(String content);

	public HTMLTag getTag();
	
}
