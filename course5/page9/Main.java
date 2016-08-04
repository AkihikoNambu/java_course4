class Main {
  public static void main(String[] args) {
    Car car = new Car("車");
    car.printData();

    System.out.println("-----------------")
    Bicycle bicycle = new Bicycle("自転車");
    bicycle.printData();
    bicycle.run(20);
    bicycle.printData();
  }
}
