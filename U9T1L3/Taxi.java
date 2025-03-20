public class Taxi extends Car {
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
      }
    public double getFareCollected() {
        return fareCollected;
    }
    public void printTaxi() {
        System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nElectric? " + isElectric() + "\nDiscount Applied? " + isDiscountApplied() + "\nTotal fare collected: " + fareCollected);
    }
    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setDiscountApplied(true);
            setTollFee(getTollFee() / 2);
        }
    }
}
