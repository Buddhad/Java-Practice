/*
Multiple Inheritance():
In Multiple inheritances, one class can have more than one
superclass and inherit features from all parent classes. 
Please note that Java does not support multiple inheritances with classes.

1.WAP to Create one parent class A and  with one Parameter a andb  One method
 Display Next Create Child B,C and one parameter c and e
 and one method Avg to calculate avg of a,band c numbers and display the e

*/

interface deb {
  int a = 2; //public ,static,finally
  void avg();
}

interface deb1 {
  int b = 2;
}

interface deb2 {
  int c = 6;
}

public class Code1 implements deb, deb1,deb2 {

  public void avg() {
    float Avg = (a + b + c) / 3;
    System.out.println("The Avg is : " + Avg);
  }

  public static void main(String[] args) {
    Code1 obj = new Code1();
    obj.avg();
  }
}
