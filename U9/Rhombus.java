public class Rhombus extends Quadrilateral {
    private int sideLen;
    public Rhombus (int per, int area, String name) {
        super(per, area, name);
        sideLen = per / 4;
    }
    public int getSideLen() {
        return sideLen;
    }
    public void rhombusInfo() {
        System.out.println("rhombuses are parallelogram quadrilaterals with equal side lengths and perpendicular diagonals");
    }
}