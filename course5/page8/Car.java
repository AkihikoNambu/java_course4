class Car extends Vehicle {
  private int fuel = 100;

  Car(String name) {
    super(name);
  }

  public int getFuel() {
    return this.fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public void printData() {
    super.printData();
    System.out.println("ガソリン量: " + this.fuel + " (L)");
  }
}
