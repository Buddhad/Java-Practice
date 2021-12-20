/*
****** Single Inheritance**********

1. WAP to Create one parent class A with one Parameter a and One method
 Display Next Create Child B where you have to use two parameter b and c 
 and fore method Addition,Multiplication,Substraction and Division to calculate  of all three numbers.

 */

class A {
  int a = 20;

  void Display() {
    System.out.println(a);
  }
}

class B extends A {
  int b = 5, c = 80;
  int d = super.a + b + c;
  int e = super.a * b * c;
  int f = super.a-b - c;
  int g = (super.a+c)/b;

  void Addition() {
    System.out.println("The Addition of Three Numbers are : " + d);
  }

  void Multiplication() {
    System.out.println("The Multiplication of Three Numbers are : " + e);
  }
  void Substraction(){
      System.out.println("The Substration of Three Numbers are : "+f);
  }
  void Division(){
      System.out.println("The Division of a and b and addition of c  : "+g);
  }
}

public class Code2 {

  public static void main(String[] args) {
    B obj = new B();
    obj.Display();
    obj.Addition();
    obj.Multiplication();
    obj.Substraction();
    obj.Division();
  }
}
