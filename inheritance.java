// The parent class (or base class)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// The child class (or derived class) inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        // Call the constructor of the base class using super()
        super(name);
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    public Cat(String name) {
        // Call the constructor of the base class using super()
        super(name);
    }

    // Additional method specific to Cat
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class inheritance{
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog("Buddy");
        myDog.eat();  // Inherited method from Animal
        myDog.sleep();  // Inherited method from Animal
        myDog.bark();  // Method specific to Dog

        // Creating an instance of Cat
        Cat myCat = new Cat("Whiskers");
        myCat.eat();  // Inherited method from Animal
        myCat.sleep();  // Inherited method from Animal
        myCat.meow();  // Method specific to Cat
    }
}
