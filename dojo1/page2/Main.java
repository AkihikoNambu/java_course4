import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("名前：");
    String name = scanner.next();

    System.out.println("私の名前は" + name + "です");
  }
}
