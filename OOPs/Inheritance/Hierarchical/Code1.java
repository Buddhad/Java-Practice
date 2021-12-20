/*
****Hierarchical Inheritance
->When two or more classes inherits a single class, it is known as hierarchical inheritance.

1. WAP to Create one parent class A and  with one Parameter a andb  One method
 Display Next Create Child B,C and one parameter c and e and one method Avg to 
 calculate avg of a,band c numbers and display the e.

*/
class A {
  int a = 10;
  int b = 5;

  void Display() {
    System.out.println("The Value of a is : "+a);
    System.out.println("The Value of b is : "+b);
  }
}

class B extends A {
  int e = 7;
  void Show() {
    System.out.println("The Value of e is : "+e);
  }
}

class C extends A {
  int c = 15;
  int d = (super.a + b + c) / 3;

  void Avg() {
    System.out.println("The Avg of a,b and c is : "+d);
  }
}

public class Code1 {

  public static void main(String[] args) {
    C obj = new C();
    B obj2 = new B();
    obj.Display();
    obj2.Show();
    obj.Avg();
  }
}
