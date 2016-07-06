class Man extends Person {
  Man(String name, int age, double height, double weight) {
    super(name, age, height, weight);
  }

  @Override boolean isHealthy() {
    double bmi = this.bmi();
    return bmi >= 18.5 && bmi < 25.0;
  }
}
