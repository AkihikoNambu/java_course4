abstract class Person {
  private static int counter = 0;

  // プロパティ
  private String name;
  private int id;
  private int age;
  private double height;
  private double weight;

  // コンストラクタ
  Person(String name, int age, double height, double weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.id = ++counter;
  }

  // ゲッター
  int getId() { return this.id; }
  String getName() { return this.name; }
  int getAge() { return this.age; }
  double getHeight() { return this.height; }
  double getWeight() { return this.weight; }

  // セッター
  void setName(String name) { this.name = name; }
  void setAge(int age) { this.age = age; }
  void setHeight(double height) { this.height = height; }
  void setWeight(double weight) { this.weight = weight; }

  // インスタンスメソッド
  void printData() {
    System.out.println("id: " + this.id);
    System.out.println("私の名前は" + this.name + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("身長は" + this.height + "mです");
    System.out.println("体重は" + this.weight + "kgです");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");

    if (isHealthy()) {
      System.out.println("健康です");
    } else {
      System.out.println("健康ではありません");
    }
  }

  double bmi() {
    return this.weight / this.height / this.height;
  }

  abstract boolean isHealthy();
}
