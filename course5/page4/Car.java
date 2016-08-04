// printDataをオーバーライド

class Car extends Vehicle {
  private int fuel;

  public int getFuel() {
    return this.fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public void printData() {
    System.out.println("現在位置: " + this.getX() + "km");
    System.out.println("ガソリン量: " + this.getFuel() + "(L)");
  }
}
