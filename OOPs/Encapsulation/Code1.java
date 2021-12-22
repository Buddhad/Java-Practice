/*
******Encapsulation******
*/

class A {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }
}

public class Code1 {

  public static void main(String[] args) {
    A obj = new A();
    obj.setName("Buddhadeb Chhetri");

    System.out.println("My  name is : " + obj.getName());
  }
}