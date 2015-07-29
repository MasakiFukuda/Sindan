package bean;
public class Bean implements java.io.Serializable{
	private String title;
	private String text;
	private String imagePath;
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return  title;
	}
	public void setText(String text){
		this.text=text;
	}
	public String getText(){
		return text;
	}
	public void setImagePath(String imagePath){
		this.imagePath=imagePath;
	}
	public String getImagePath(){
		return imagePath;
	}
}