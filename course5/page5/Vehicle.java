class Vehicle {
  private String name;
  private int x;

  Vehicle(String name) {
    this.name = name;
    this.x = 0;
  }

  public void printData() {
    System.out.println("名前: " + this.name);
    System.out.println("現在位置: " + this.x + "km");
  }
}
