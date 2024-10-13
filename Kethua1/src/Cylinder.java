public class Cylinder extends Circle {
    private double height;

    /**
     * Contructor 1.
     */
    public Cylinder() {
    }

    /**
     * Contructor 2 With Cylinder(double).
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * Contructor 3 With Cylinder(double, double).
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Contructor 4 With Cylinder(double, double, String).
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Getter n Setter for height.
     */
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get Volume.
     * @return volume
     */
    public double getVolume() {
        return super.getArea() * this.height;
    }

    /**
     * Cylinder toString.
     */
    @Override
    public String toString() {
        return String.format("Cylinder[%s,heigh=%.1f]",
                super.toString(),
                this.height);
    }

    /**
     * Get Cylinder Area.
     * @return Cylinder area.
     */
    @Override
    public double getArea() {
        return super.getArea() + 2.0 * PI * height;
    }
}
