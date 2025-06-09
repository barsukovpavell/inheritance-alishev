public class Dog extends Animal {

    public Dog(int id) {
        super(id);
    }

    public void bark() {
        System.out.println("Гав!");
    }

    @Override
    public void eat() {
        System.out.println("Я ем кости.");
    }

    @Override
    public void sleep() {
        System.out.println("Я сплю в будке.");
    }

    public void showName() {
        System.out.println(name);
    }
}
