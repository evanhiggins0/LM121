public class TestGeometricObject {
    public static void main(String[] args){

        Circle test1 = new Circle(10.5);
        Circle test2 = new Circle(15.4);

        GeometricObject[] tests = {new Square(10), new Square(5,"Blue",true),
                new Square(4), new Square(7, "Green", true), new Square(8)};

        System.out.println((test1.compareTo(test2) == 1 ? "\nTest1 " : "\nTest2 ") + "is the larger circle");

        for(int i = 0; i < tests.length; i++){
            System.out.println("\nSquare Num. " + (i + 1));
            System.out.println("Area: " + tests[i].getArea());
            System.out.println("Perimeter: " + tests[i].getPerimeter());
            System.out.println("Colour: " + ((Square)tests[i]).getColor());
            System.out.println("How to colour: " + ((Square)tests[i]).howToColor());
        }


    }
}
