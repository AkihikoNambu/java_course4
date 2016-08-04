class Car extends Vehicle {
  private int fuel;

  Car(String name) {
    super(name);
  }

  Car(String name, Person owner) {
    super(name, owner);
  }

  public int getFuel() {
    return this.fuel;
  }

  public void setFuel(int fuel) {
    this.fuel = fuel;
  }

  public void printData() {
    super.printData();
    System.out.println("ガソリン量: " + this.fuel + " (L)");
  }

  public void run(int distance) {
    if (distance > fuel) {
      System.out.println("ガソリンが足りません");
    } else {
      this.x += distance;
      this.fuel -= distance;
      System.out.println(distance + "km走りました");
    }
  }
}
