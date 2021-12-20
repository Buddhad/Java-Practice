/*
2. WAP to Create one parent class A ,Band C with one Parameter a and One method
Display Next Create Child B where you have to use two parameter b and c 
and four method Addition,Multiplication,Substraction and Division to calculate  
of all three numbers.

*/


class A{
    int a=4;
    int b=5;
   
}
class B extends A{
    int add=super.a+b;
    float divi=super.b/a;

    void Addition(){
        System.out.println("The Addition of a and b is :"+add);
    }
    void Division(){
        System.out.println("The Division of a and b is : "+divi);
    }

}
class C extends A{

    int sub=super.a-b;
    int mul=super.a*b;
    void Substraction(){
        System.out.println("The Substraction of a and b is : "+sub);
    }
    void Multiplication(){
        System.out.println("The Multiplication of a and b is : "+mul);
    }
}

public class Code1{
    public static void main(String[] args){
        B obj=new B();
        C obj1=new C();

        obj.Addition();
        obj.Division();
        obj1.Substraction();
        obj1.Multiplication();

    }
}
