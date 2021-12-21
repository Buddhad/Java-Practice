/*
*********Method Overloading*******
->If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

1. Advantage of method overloading
->Method overloading increases the readability of the program.

2. There are two ways to overload the method in java

By changing number of arguments
By changing the data type

**Note::
 Compile Time Error is better than Run Time Error. 
 So, java compiler renders compiler time error if you declare the same method having same parameters.

*/

class A{
    int a=5,b;
   public void show(){
        System.out.println("The Value of a is : "+a);
      
    }

    public void show(int x, int y){
       
        System.out.println("The Value of  a is  "+x);
        System.out.println("The Value of  b is  "+y);
    }
}
class B extends A{
    String b="Buddhadeb Chhetri";
    void Display(){
        System.out.println("The Value of b is : "+b);
    }
}

public class Over{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.show(9,26);
        obj.Display();

    }
}