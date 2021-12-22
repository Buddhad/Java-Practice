/*
******Overriding in Java*****
->If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.

1. Usage of Java Method Overriding

i)Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
ii)Method overriding is used for runtime polymorphism

Rules:-
1. The method must have the same name as in the parent class
2. The method must have the same parameter as in the parent class.
3. There must be an IS-A relationship (inheritance).


*/
class A 
{
    void show(int x)
    {
        System.out.println("first method "+x);
    }
}
class B extends A
{
    void show(char x)
    {
        System.out.println("second method "+x);
    }
}
public class Oriding
{
    public static void main(String[] args) {

//         Main m= new Main();
        B m= new B();
        m.show(50);
        m.show('m');

    }
}
