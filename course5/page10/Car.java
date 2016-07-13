class Car extends Vehicle {
  private int fuel;

  Car(String name) {
    super(name);
    this.fuel = 100;
  }

  Car(String name, Person owner) {
    super(name, owner);
    this.fuel = 100;
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
