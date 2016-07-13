class Woman extends Person {
  Woman(String name, int age, double height, double weight) {
    super(name, age, height, weight);
  }

  @Override boolean isHealthy() {
    double bmi = this.bmi();
    return bmi > 17.0 && bmi < 22.0;
  }
}
