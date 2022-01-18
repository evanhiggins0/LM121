public class TestMyPoint{
	public static void main(String[] args){
		
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(3,7);
		MyPoint p3 = new MyPoint(5,9);
		
		System.out.println("Point 1 Coordinates: (" + p1.getX() + "," + p1.getY() + ")");
		System.out.println("Point 2 Coordinates: (" + p2.getX() + "," + p2.getY() + ")");
		System.out.println("Point 3 Coordinates: (" + p3.getX() + "," + p3.getY() + ")");
		System.out.println(MyPoint.Distance(p2,p3));
		System.out.println(MyPoint.Distance(p1,3,9));
	}
}