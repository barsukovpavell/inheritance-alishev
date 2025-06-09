public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(1);
        Cat cat = new Cat(2);
        Person person = new Person("Bob");

        person.seyHello();
        person.showInfo();
        System.out.println();

        dog.showName();
        dog.showInfo();
        dog.bark();
        dog.eat();
        dog.sleep();
        System.out.println();

        cat.showName();
        cat.showInfo();
        cat.showSound();
        cat.eat();
        cat.sleep();

    }
}
