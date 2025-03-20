public class Quadrilateral {
    private int perimeter;
    private int area;
    private String shapeName;
    public Quadrilateral(int per, int area, String name) {
        perimeter = per;
        this.area = area;
        shapeName = name;
    }
    public int getPerimeter() {
        return perimeter;
    }
    public int getArea() {
        return area;
    }
    public String getShapeName() {
        return shapeName;
    }
    public void quadrilateralInfo() {
        System.out.println("quadrilaterals are closed polygons with 4 sides");
    }
    public void perimeterOrAreaGreater() {
        String which = "";
        if (perimeter > area) {
            which = "perimeter";
        } else if (perimeter < area) {
            which = "area";
        } else {
            which = "equal";
        }
        System.out.println(which);
    }
}