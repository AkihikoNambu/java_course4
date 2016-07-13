class Person {
  private static int counter = 0;
  private String firstName, middleName, lastName, nationality;
  private int age;
  private double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight, String nationality) {
    counter++;
    System.out.println(counter + "人目のPersonです");
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.nationality = nationality;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight, String nationality) {
    this(firstName, lastName, age, height, weight, nationality);
    this.middleName = middleName;
  }

  public String getFirstName() {
    return this.firstName;
  }
  public String getMiddleName() {
    return this.middleName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public int getAge() {
    return this.age;
  }
  public double getHeight() {
    return this.height;
  }
  public double getWeight() {
    return this.weight;
  }
  public String getNationality() {
    return this.nationality;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
  public void setNationality(double weight) {
    this.nationality = nationality;
  }

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("国籍は" + this.nationality + "です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("合計で" + counter + "人のPersonがいます。");
  }
}
