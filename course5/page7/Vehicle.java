class Vehicle {
  private int x = 0;
  private String name;

  Vehicle(String name) {
    this.name = name;
  }

  public void printData() {
    System.out.println("現在位置: " + this.x + "km");
  }

  public int getX() {
    return this.x;
  }

  public String getName() {
    return this.name;
  }
}
