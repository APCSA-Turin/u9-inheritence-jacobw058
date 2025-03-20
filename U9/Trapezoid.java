public class Trapezoid extends Quadrilateral {
    private int height;
    public Trapezoid(int height, int per, int area, String shapeName) {
        super(per, area, shapeName);
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void trapezoidInfo() {
        System.out.println("a trapezoid is a quadrilateral with exactly one parallel pair");
    }
}