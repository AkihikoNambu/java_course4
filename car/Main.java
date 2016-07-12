class Main {
  public static void main(String[] args) {
    Car car = new Car("プリウス");
    car.printData();
    car.run(60);
    car.charge(20);
    car.run(100);
  }
}
