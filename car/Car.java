class Car {
  private String name;
  private String color;
  private int x = 0;
  private int fuel = 100;
  private static count = 0;

  Car(String name) {
    count++;
    this.name = name;
  }

  Car(String name, int fuel) {
    this(name);
    this.fuel = fuel;
  }

  public String getName() { return this.name; }
  public int getX() { return this.x; }
  public int getFuel() { return this.fuel; }

  public void setName(String name) { this.name = name; }

  public void printData() {
    System.out.println("名前:" + this.name);
    System.out.println("現在位置:" + this.x + "km");
    System.out.println("ガソリン量:" + this.fuel + "リットル");
  }

  public static void printCount() {
    System.out.println("合計で" + count + "台の車があります。");
  }
}
