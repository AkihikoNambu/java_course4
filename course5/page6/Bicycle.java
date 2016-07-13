class Bicycle extends Vehicle {
  Bicycle(String name) {
    super(name);
  }

  public void run(int distance) {
    this.x += distance;
    System.out.println(distance + "km走りました");
  }
}
