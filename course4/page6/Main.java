class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    // person1のインスタンスフィールドnameに、「Kate Jones」をセットしてください
    person1.name = "Kate Jones";
    person1.hello();
    System.out.println(person1.name);

    Person person2 = new Person();
    // person2のインスタンスフィールドnameに、「John Smith」をセットしてください
    person2.name = "John Smith";
    person2.hello();
    System.out.println(person2.name);
  }
}
