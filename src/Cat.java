public class Cat extends Animal{

    @Override
    public void eat() {
        super.eat();
        System.out.println("Я ем рыбу");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Я сплю в доме.");
    }
}
