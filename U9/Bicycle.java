public class Bicycle extends Vehicle {
    private int gearCount;
    public Bicycle(int gears, String name, int wheels) {
        super(name, wheels);
        gearCount = gears;
    }
    public int getGearCount() {
        return gearCount;
    }
    public void ringBell() {
        System.out.println("ring");
    }
}