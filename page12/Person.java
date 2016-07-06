class Person {
  static int counter = 0;

  String firstName;
  String middleName;
  String lastName;
  int age;
  double height;
  double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    counter++;
    System.out.println(counter + "人目のPersonです");
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    counter++;
    System.out.println(counter + "人目のPersonです");
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.middleName = middleName;
  }


  String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("身長は" + this.height + "mです");
    System.out.println("体重は" + this.weight + "kgです");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  double bmi() {
    return this.weight / this.height / this.height;
  }

  static void printCount() {
    System.out.println("合計で" + counter + "人のPersonがいます。");
  }
}
