// gennaralization
public class Animal {
    void eat() {
        System.err.println(">> This animal eats food.");
    }
}

// specialization
class Dog extends Animal {
    void eat() {
        System.err.println(">> This Dog eats food.");
    }

    void bark() {
        System.err.println(">> Hog Hog!!");
    }
}

class testAnimal {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.eat();
        Animal dg2 = new Dog();
        dg2.eat();

        Dog dg = new Dog();
        dg.eat();
        dg.bark();

    }
}
