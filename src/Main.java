public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.showName();
        dog.bark();
        dog.eat();
        dog.sleep();
        System.out.println();
        cat.showName();
        cat.showSound();
        cat.eat();
        cat.sleep();

    }
}
