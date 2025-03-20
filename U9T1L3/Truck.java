public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }
    public void printTruck() {
        System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nNumber of axles " + axles + "\nHas trailer? " + hasTrailer);
    }
    public boolean validateLicensePlate() {
        if (!hasTrailer) {
            return true;
        } else {
            if ((axles > 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("MX")) 
            || (axles <= 4 && getLicensePlate().substring(getLicensePlate().length() - 2).equals("LX"))) {
                return true;
            }
        }
        return false;
    }
  }