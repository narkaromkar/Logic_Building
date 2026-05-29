// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
  public static void main(String[] args) {
    int a = 20;
    int b = 50;
    int temp = 0;

    System.out.println("value of a :" + a);
    System.out.println("value of b :" + b);

    temp = a;
    a = b;
    b = temp;

    System.out.println("value of a after swap:" + a);
    System.out.println("value of b after swap:" + b);


    System.out.println("restore the value of a and b without using temp");

    a = a+b;
    b = a-b;
    a = a-b;

    System.out.println("swap without temp, value of a :" + a);
    System.out.println("swap without temp, value of b :" + b);

    System.out.println("swap with ex-or bitwise operator");

    a = a^b;
    b = a^b;
    a = a^b;

    System.out.println("swap with bitwise ex-or, value of a :" + a);
    System.out.println("swap with bitwise ex-or, value of b :" + b);

  }
}