class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle("自転車");
    bicycle.printData();
    bicycle.run(20);
    bicycle.printData();
    System.out.println();

    Car car = new Car("車");
    car.printData();
    car.run(60);
    car.printData();
  }
}
