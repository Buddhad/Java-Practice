/*
Logical Operators Examples

&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

*/



public class Logic{
    public static void main(String[] args){
        int a=5;
        System.out.println(a>2 && a<10);
        System.out.println(a>2 || a<10);
        System.out.println(!(a>2 && a<10));

    }
}