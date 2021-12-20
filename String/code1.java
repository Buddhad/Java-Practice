/*
1. Java Strings:
->Strings are used for storing text.
->A String variable contains a collection of characters surrounded by double quotes.


2. String Methods:
->There are many string methods available, for example toUpperCase() and toLowerCase()

3. Finding a Character in a String:
->The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)

4. String Concatenation:
->The + operator can be used between strings to combine them. This is called concatenation
->We can also use the concat() method to concatenate two strings


5. Special Characters
\'	'	Single quote
\"	"	Double quote
\\	\	Backslash

6. Escape Sequences
->Six other escape sequences are valid in Java

\n	New Line	
\r	Carriage Return	
\t	Tab	
\b	Backspace	
\f	Form Feed


7. 
*****WARNING!***

->Java uses the + operator for both addition and concatenation.

->Numbers are added. 
->Strings are concatenated.

*/

public class code1 {

  public static void main(String[] args) {
    String name = "Buddhadeb Chhetri";
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String FName = "Buddhadeb";
    String LName = "Chhetri";
    String sent = "I am from \"Kalyani\" near Phonix gate.";
    String Sent = "It\'s  alright.";
    String back = "It\'s  \\ alright.";

    System.out.println(name);
    System.out.println("The length of the txt string is: " + txt.length());
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.indexOf("deb"));
    System.out.println(FName + "" + LName);
    System.out.println(FName.concat(LName));
    System.out.println(sent);
    System.out.println(Sent);
    System.out.println(back);
  }
}
