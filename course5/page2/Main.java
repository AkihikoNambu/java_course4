class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.setFuel(100);
    car.printData();
    System.out.println("ガソリン量: " + car.getFuel() + " (L)");
  }
}
