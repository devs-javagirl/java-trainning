public abstract class Animal {
    private Animal(){
        System.out.println("Animal should not be created here");
    }
    public void eat() {
        System.out.println("Animal is eating");
    }
    
}

public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}