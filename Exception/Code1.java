/*
2. WAP to display your name Finally block during Arithmatic Exception.
*/

class Code1
{
    public static void main(String args[])
    {
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
        finally{
          System.out.println("Buddhadeb Chhetri");
        }
    }
}
