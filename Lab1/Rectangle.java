public class Rectangle{

	private double width  = 1;
	private double height = 1;
	
	public Rectangle(){
	}
	
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double getArea(){
		return this.width * this.height;
	}
	public double getPerimiter(){
		return (this.width + this.height) * 2;
	}
	public String toString(){
		return "Width: " + this.width + "\nHeight: " + this.height + "\nArea: " + this.getArea() + "\nPerimiter: " + this.getPerimiter() + "\n" + "-----------------\n";
	}
	}