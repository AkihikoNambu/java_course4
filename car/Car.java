class Car {
  private String name;
  private int x = 0;
  protected int fuel = 100;
  private static int count = 0;

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
    System.out.println("名前: " + this.name);
    System.out.println("現在位置: " + this.x + "km");
    System.out.println("ガソリン量: " + this.fuel + "リットル");
  }

  public void run(int distance) {
    if (distance > fuel) {
      System.out.println("ガソリンが足りません");
    } else {
      this.x += distance;
      this.fuel -= distance;
      System.out.println(distance + "km走りました");
    }
  }

  public void charge(int fuel) {
    this.fuel += fuel;
    System.out.println(fuel + "リットル給油しました");
  }

  public static void printCount() {
    System.out.println("合計で" + count + "台の車があります。");
  }
}
