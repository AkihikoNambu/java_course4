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
  }
}
