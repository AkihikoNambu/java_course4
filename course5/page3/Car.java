// 独自のフィールドとメソッドを追加

class Car extends Vehicle {
  private int fuel;

  public int getFuel() {
    return this.fuel;
  }

  // setFuelが必要か？
  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
}
