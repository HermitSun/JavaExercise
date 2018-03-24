package test;

public class Exercise11 {
	public static void main(String[] args) {
		new Rectangle();
	}
}
class Rectangle{
	int width;
	int height;
	//instances
	public Rectangle() {
		System.out.println("Successfully create a rectangle.");
	}
	//creator
	public void setWidth(int width) {
		this.width=width;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	//setter
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	//getter
}