public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
      super(licensePlate, tollFee, passengers);
      this.electric = electric;
      discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
      return electric;
    }
  
    public boolean isDiscountApplied() {
      return discountApplied;
    }
    public void printCar() {
        System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nElectric? " + electric + "\nDiscount Applied? " + discountApplied);
    }
    public boolean dropOffPassengers(int numOut) {
        if (numOut >= getPassengers()) {
            return false;
        } else {
            setPassengers(getPassengers() - numOut);
            return true;
        }
    }
    public void setDiscountApplied(boolean discountApplied) {
      this.discountApplied = discountApplied;
    }
    public void applyDiscount() {
        if (electric && !discountApplied) {
            setTollFee(getTollFee() / 2);
            discountApplied = true;
        }
    }
  }