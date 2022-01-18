public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square(){ }

    public Square(double side){
        this.side = side;
    }

    public Square(double side, String colour, boolean filled){
        super(colour, filled);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String howToColor() {
        return "Colour all four sides";
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + side
                + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter();
    }
}
