/*
********Single Inheritance
->When a class inherits another class, it is known as a single inheritance. 

1. WAP to Create one parent class A with one Parameter a and One method
 Display Next Create Child B where you have to use two parameter b and c 
 and one method Avg to calculate avg of all three numbers.

*/

class A {
  int a = 2;

  void display() {
    System.out.println(a);
  }
}

class B extends A {
  int b = 4, c = 6;

  void Avg() {
    int S = (super.a + b + c) / 3;
    System.out.println(S);
  }
}

public class Code1 {

  public static void main(String[] args) {
    B obj = new B();
    obj.display();
    obj.Avg();
  }
}


//Stillwater Code
/*

class A {
  int a=5;

 void display() {
    System.out.println(a);
  }
}
class B extends A{
  int b,c;

  public B(){
      this.b=4;
      this.c=6;
  }

  void Display() {
    // System.out.println(this.b);
    int S = (a + b + c) / 3;
    System.out.println(S);
  }
}

class Code1 {
  public static void main(String[] args) {
      B obj = new B();
    //   obj.display();
      obj.Display();
  }
}

*/
