/*
*****Multilevel Inheritance*******
->When there is a chain of inheritance, it is known as multilevel inheritance.

1. WAP to Create two parents class A and B with one Parameter a and b and One method
 Display Next Create Child C where you have to use one parameter  c 
 and one method Avg to calculate avg of all three numbers.
*/

class A {
  int a = 2;

  void meth1() {
    System.out.println(a);
  }
}

class B extends A {
  int b = 4;

  void meth2() {
    System.out.println(b);
  }
}

class C extends B{
  int c = 5;
  int d = (super.a + b + c) / 3;

  void Avg() {
    System.out.println("The Avg of all three numbers : " + d);
  }
}

public class Code1 {

  public static void main(String[] args) {
    C obj = new C();
    obj.meth1();
    obj.meth2();
    obj.Avg();
  }
}
