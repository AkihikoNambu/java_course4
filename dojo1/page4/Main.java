import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前：");
    String firstName = scanner.next();

    System.out.print("名字：");
    String lastName = scanner.next();
    String name = firstName + " " + lastName;

    System.out.print("年齢：");
    int age = scanner.nextInt();

    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }
}
