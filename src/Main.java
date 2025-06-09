public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(1);
        Cat cat = new Cat(2);
        Person person = new Person("Bob");

        Animal animal_1 = new Animal(4);
        Person person_1 = new Person("Ron");

        outputInfo(animal_1);
        outputInfo(person_1);

        System.out.println();
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

    public static void outputInfo(Info inffo) {
        inffo.showInfo();
    }
}
