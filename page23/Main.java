class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);

    Car car = new Car("車", person1);
    System.out.println("【車の情報】");
    car.printData();

    System.out.println("【所有者の情報】");
    car.getOwner().printData();
  }
}
