public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(1);
        Cat cat = new Cat(2);
        Person person = new Person("Bob");

        person.givenName();
        System.out.println();

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
