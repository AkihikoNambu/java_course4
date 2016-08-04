class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    Car car = new Car("車");
    Bicycle bicycle = new Bicycle("自転車");

    person1.buy(car);
    System.out.println("【車の情報】");
    car.printData();
    System.out.println("【所有者の情報】");
    car.getOwner().printData();

    person2.buy(bicycle);
    System.out.println("【自転車の情報】");
    bicycle.printData();
    System.out.println("【所有者の情報】");
    bicycle.getOwner().printData();
  }
}
