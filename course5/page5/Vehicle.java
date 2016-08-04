class Vehicle {
  protected int x = 0;

  public void printData() {
    System.out.println("現在位置: " + this.x + "km");
  }

  public int getX() {
    return this.x;
  }
}
