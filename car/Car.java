class Car extends Vehicle {
  private int fuel;

  Car(String name, int fuel) {
    super(name);
    this.fuel = fuel;
  }

  public int getFuel() { return this.fuel; }

  public void printData() {
    super.printData();
    System.out.println("ガソリン量: " + this.fuel + "リットル");
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

  public void charge(int fuel) {
    this.fuel += fuel;
    System.out.println(fuel + "リットル給油しました");
  }
}
