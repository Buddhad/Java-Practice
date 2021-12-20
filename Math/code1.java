/*

1. Java Math
->The Java Math class has many methods that allows you to perform mathematical tasks on numbers

2.Math.max(x,y)
->The Math.max(x,y) method can be used to find the highest value of x and y.
3.Math.min(x,y)
4.Math.sqrt(x)
->The Math.sqrt(x) method returns the square root of x.
5.Math.abs(x)
->The Math.abs(x) method returns the absolute (positive) value of x.
6.Math.random()
->Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)

*/

public class code1{
    public static void main(String[] args){
    
    int randomNum = (int)(Math.random() * 101);
        System.out.println(Math.max(6,2));
        System.out.println(Math.min(6,2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.abs(-20));
        System.out.println(Math.random());
        System.out.println(randomNum);
        

    }
}