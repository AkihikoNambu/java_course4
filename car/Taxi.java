class Taxi extends Car {
  private int fare;

  Taxi(String name) {
    super(name);
    this.fare = 730;
  }

  Taxi(String name, int fuel) {
    super(name, fuel);
    this.fare = 730;
  }

  public int getFare() { return this.fare; }

  public void printData() {
    super.printData();
    System.out.println("料金: " + this.fare + "円");
  }

  public void run(int distance) {
    if (distance <= this.fuel) {
      this.fare += distance * 700; // 定数にしてもいいかも
    }
    super.run(distance);
  }
}
