class Vehicle {
  protected int x = 0;

  Vehicle() {
    System.out.println("Vehicleクラスのコンストラクタです");
  }

  public void printData() {
    System.out.println("現在位置: " + this.x + "km");
  }

  public int getX() {
    return this.x;
  }
}
