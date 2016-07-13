class Person {
  public String name;

  public void hello() {
    // 「こんにちは、私は◯◯です」となるように、thisを用いて書き換えてください
    System.out.println("こんにちは、私は" + this.name + "です");
  }
}
