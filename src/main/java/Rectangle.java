public class Rectangle {
    private double length = 4;
    private double width = 8;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length) {
        this.length = length;
    }

    public Rectangle() {}

    public  double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

}