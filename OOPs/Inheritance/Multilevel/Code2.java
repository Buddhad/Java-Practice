/*
****Multilevel Inheritance 

2. WAP to Create one parent class A with one Parameter a and One method
 Display Next Create Child B where you have to use two parameter b and c 
 and fore method Addition,Multiplication,Substraction and Division to calculate  of all three numbers.


 */

class A {
  int a = 2;

  void show() {
    System.out.println(a);
  }
}

class B extends A {
  int b = 4;

  void display() {
    System.out.println(b);
  }
}

class C extends B {
  int c = 8;
  int add = super.a + b + c;
  int sub = super.a - b - c;
  int div = super.a / b + c;
  int mul = super.a * b * c;

  void Addition() {
    System.out.println("The Addition of three numbers : " + add);
  }

  void Substraction() {
    System.out.println("The Substraction of three numbers : " + sub);
  }

  void Division() {
    System.out.println(
      "The Division of a and b and addition of a  the number is  : " + div
    );
  }

  void Multiplication() {
    System.out.println("The Multiplication of three number : " + mul);
  }
}

public class Code2 {

  public static void main(String[] args) {
    C obj = new C();
    obj.show();
    obj.display();
    obj.Addition();
    obj.Substraction();
    obj.Multiplication();
    obj.Division();
  }
}
