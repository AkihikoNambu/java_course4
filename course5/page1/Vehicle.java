// Vehicleクラスの定義

class Vehicle {
  private int x = 0;

  public void printData() {
    System.out.println("現在位置: " + this.x + "km");
  }

  public int getX() {
    return this.x;
  }
}
