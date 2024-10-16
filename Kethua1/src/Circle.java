public class Circle {
    private double radius;
    private String color;
    protected static final double PI = 3.141592;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Getter n Setter for radius n color.
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 2.0 * PI * getRadius();
    }

    /**
     * toString.
     */
    public String toString() {
        return String.format("Circle[radius=%.1f,color=%s]", this.radius, this.color);
    }
}
