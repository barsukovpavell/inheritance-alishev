public class Animal {
    public int id;

    public Animal(int id) {
        this.id = id;
    }
    String name = "I'm alive!";

    public void showName() {
        System.out.println(name);
    }

    public void eat() {
        System.out.println("Я умею есть.");
    }

    public void sleep() {
        System.out.println("Я умею спать.");
    }
}
