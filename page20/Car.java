class Car extends Vehicle {
  private int fuel;

  public int getFuel() {
    return this.fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public static void printData() {
    super.printData();
    System.out.println("ガソリン量: " + this.fuel + " (L)");
  }
}
