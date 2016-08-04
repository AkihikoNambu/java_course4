class Bicycle extends Vehicle {
  Bicycle(String name) {
    super(name);
  }

  Bicycle(String name, Person owner) {
    super(name, owner);
  }

  public void run(int distance) {
    this.x += distance;
    System.out.println(distance + "km走りました");
  }
}
