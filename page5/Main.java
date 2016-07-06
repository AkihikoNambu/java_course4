class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    Person person2 = new Person();

    person1.hello();
    person2.hello();

    person1.name = "Kate Jones";
    System.out.println(person1.name);

    person2.name = "John Smith";
    System.out.println(person2.name);
  }
}
