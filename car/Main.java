class Main {
  public static void main(String[] args) {
    Car car = new Car("プリウス", 100);
    car.printData();
    car.run(60);
    car.printData();
    car.charge(20);
    car.printData();
    car.run(100);
    car.printData();

    Bicycle bicycle = new Bicycle("自転車");
    bicycle.printData();
    bicycle.run(30);
    bicycle.printData();
  }
}
