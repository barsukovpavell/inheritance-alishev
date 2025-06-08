public class Dog extends Animal{


    @Override
    public void eat() {
        System.out.println("Я ем кости.");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Я сплю в будке.");
    }
}
