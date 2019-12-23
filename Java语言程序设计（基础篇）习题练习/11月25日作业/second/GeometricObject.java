package second;

public class GeometricObject {

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public boolean isFilled() {
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
public java.util.Date getDateCreatedDate() {
	return dateCreatedDate;
}
private String color ;
private boolean filled;
private java.util.Date dateCreatedDate;
public GeometricObject(){
	dateCreatedDate =new java.util.Date();
	color="while";
	filled=false;
	
}
public 	GeometricObject(String color1,boolean filled1){
	color=color1;
	filled=filled1;
	dateCreatedDate =new java.util.Date();
}
 public String toString(){
	 return "created on "+dateCreatedDate+"\ncolor:"+color+"and filled:"+filled;
 }
}
