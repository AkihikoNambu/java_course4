abstract class Vehicle {
  private String name;
  protected int x = 0;

  Vehicle(String name) {
    this(name);
  }

  public int getX() {
    return this.x;
  }

  public void printData() {
    System.out.println("名前: " + this.name);
    System.out.println("現在位置: " + this.x + "km");
  }

  abstract public void run(int distance);
}
