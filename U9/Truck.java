public class Truck extends Vehicle {
    private int weight;
    public Truck(int weight, String name, int wheels) {
        super(name, wheels);
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void accelerate() {
        System.out.println("speeding up");
    }
}