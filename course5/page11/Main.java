class Main {
  public static void main(String[] args) {
    Car car = new Car("車");
    Bicycle bicycle = new Bicycle("自転車");
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);

    person1.buy(car);
    System.out.println("【車の情報】");
    car.printData();
    System.out.println("【所有者の情報】");
    car.getOwner().printData();

    person1.buy(bicycle);
    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("【所有者の情報】");
    bicycle.getOwner().printData();
  }
}
