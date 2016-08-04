abstract class Vehicle {
  private String name;
  protected int x = 0;
  private Person owner;

  Vehicle(String name) {
    this.name = name;
  }

  Vehicle(String name, Person owner) {
    this(name);
    this.owner = owner;
  }

  public int getX() {
    return this.x;
  }

  public Person getOwner() {
    return this.owner;
  }

  public void printData() {
    System.out.println("名前: " + this.name);
    System.out.println("現在位置: " + this.x + "km");
  }

  abstract public void run(int distance);
}
