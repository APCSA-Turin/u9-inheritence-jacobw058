public class QuadrilateralRunner {
    public static void main(String[] args) {
        Quadrilateral myQuad = new Quadrilateral(16, 16, "square");
        System.out.println(myQuad.getPerimeter());
        System.out.println(myQuad.getArea());
        System.out.println(myQuad.getShapeName());
        myQuad.quadrilateralInfo();
        myQuad.perimeterOrAreaGreater();

        Rhombus myRhombus = new Rhombus(16, 16, "rhombus");
        System.out.println(myRhombus.getPerimeter());
        System.out.println(myRhombus.getArea());
        System.out.println(myRhombus.getShapeName());
        System.out.println(myRhombus.getSideLen());
        myRhombus.RhombusInfo();
        myRhombus.perimeterOrAreaGreater();

        Trapezoid myTrapezoid = new Trapezoid(2, 14, 10, "Trapezoid");
        System.out.println(myTrapezoid.getPerimeter());
        System.out.println(myTrapezoid.getArea());
        System.out.println(myTrapezoid.getShapeName());
        System.out.println(myTrapezoid.getHeight());
        myTrapezoid.TrapezoidInfo();
        myTrapezoid.perimeterOrAreaGreater();
    }
}