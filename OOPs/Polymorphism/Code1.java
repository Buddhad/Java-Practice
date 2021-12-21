/*
**********Polymorphism************

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

1.Why And When To Use "Inheritance" and "Polymorphism"?
->
It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

Q1. 
*/

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Code1 {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}