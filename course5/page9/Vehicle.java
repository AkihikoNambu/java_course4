abstract class Vehicle {
  private String name;
  protected int x;
  private Person owner;

  Vehicle(String name) {
    this.name = name;
    this.x = 0;
  }

  Vehicle(String name, Person owner) {
    this(name);
    this.owner = owner;
  }

  public Person getOwner() {
    return this.owner;
  }

  public void setOwner(Person owner) {
    this.owner = owner;
  }

  public void printData() {
    System.out.println("名前: " + this.name);
    System.out.println("現在位置: " + this.x + "km");
  }

  abstract public void run(int distance);
}
