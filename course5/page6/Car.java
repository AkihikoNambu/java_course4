class Car extends Vehicle {
  private int fuel;

  Car() {
    super();
    System.out.println("Carクラスのコンストラクタです");
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
