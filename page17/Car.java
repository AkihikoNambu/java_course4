class Car extends Vehicle {
  private int fuel;

  public int getFuel() {
    return this.fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public static void printData() {
    System.out.println("現在位置: " + this.x + "km");
    System.out.println("ガソリン量: " + this.fuel + " (L)");
  }
}
