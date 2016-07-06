class Person {
  String firstName;
  String lastName;
  int age;
  double height;
  double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  String fullName() {
    return this.firstName + " " + this.lastName;
  }
}
