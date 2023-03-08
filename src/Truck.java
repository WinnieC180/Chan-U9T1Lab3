public class Truck extends Vehicle {
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate() {
    if (hasTrailer) {
      if (getLicensePlate().substring(getLicensePlate().length()-2).equals("MX") && axles > 4) {
        return true;
      } else if (getLicensePlate().substring(getLicensePlate().length()-2).equals("LX") && axles <= 4) {
        return true;
      } else {
        return false;
      }
    }
    return true;
  }

  public void printTruck() {
    System.out.println("License Plate: " + getLicensePlate() + "\nToll fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nNumber of axles: " + axles + "\nHas trailer? " + hasTrailer);
  }
}