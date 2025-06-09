public class Animal implements Info {
    String name = "I'm alive!";
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Наш id: " + this.id);
    }

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
