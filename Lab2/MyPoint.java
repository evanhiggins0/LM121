import java.util.*;
public class MyPoint{
	
	private double x = 0;
	private double y = 0;

	public MyPoint(){}

	public MyPoint(double newX, double newY){
		this.x = newX;
		this.y = newY;
	}

	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public static double Distance(MyPoint a, MyPoint b){
		double y2 = b.getY();
		double x2 = b.getX();
		return Distance(a, x2, y2);
	}
	
	public static double Distance(MyPoint a, double x2, double y2){
		double y1 = a.getY();
		double x1 = a.getX();
		
		double bracket1 = Math.pow((x2 - x1), 2);
		double bracket2 = Math.pow((y2 - y1), 2);
		
		double result = Math.sqrt(bracket1 + bracket2);
		
		return result;
	}
}