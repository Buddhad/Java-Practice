/*
***********Abstraction***********
->Data abstraction is the process of hiding certain details and showing only essential information to the user.

->abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods.

Q1.Why And When To Use Abstract Classes and Methods?
Ans: To achieve security - hide certain details and only show the important details of an object.

*/
abstract class Name {
  // Abstract method (does not have a body)
  public abstract void Person();
  // Regular method
  public void sleep() {
    System.out.println("Deb is Sleeping ... Zzz");
  }
}


class student extends Name {
  public void Person() {
    System.out.println("Deb Is Running");
  }
}

class Abst {
  public static void main(String[] args) {
    student obj = new student(); 
    obj.Person();
    obj.sleep();
  }
}