/*

***********Abstraction***********

Q1. WAP to do the Addition ,Subtraction , Multiplecation and Division.

*/
abstract class Calculation{
    int a=5,b=2;
    
    public abstract void add();
    public abstract void sub();
    public abstract void mul();
    public abstract void div();

}

class display extends Calculation{
    

    public void add(){
       int c=super.a+b;
        System.out.println("The Addition is : "+c);

    }
    public void sub(){
        int s=super.a-b;
        System.out.println("The Substraction is : "+s);
    } 
    public void mul(){
        int m=super.a*b;
        System.out.println("The Substraction is : "+m);
    }
     public void div(){
        float d=super.a/b;
        System.out.println("The Substraction is : "+d);
    }


}
public class Code1{
    public static void main(String[] args){
        display obj = new display();

        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}