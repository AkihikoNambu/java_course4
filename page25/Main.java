class Main {
  public static void main(String[] args) {

    Car car = new Car("車");
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.buy(car);

    System.out.println("【車の情報】");
    car.printData();

    System.out.println("【所有者の情報】");
    car.getOwner().printData();

  }
}
