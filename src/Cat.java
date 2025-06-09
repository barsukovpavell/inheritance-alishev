public class Cat extends Animal {

    public Cat(int id) {
        super(id);
    }

    public void showSound() {
        System.out.println("Мяу!");
    }

    @Override
    public void eat() {
        System.out.println("Я ем рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("Я сплю в доме.");
    }

}
