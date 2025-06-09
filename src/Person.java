public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void seyHello() {
        System.out.println("Привет!");
    }

    @Override
    public void showInfo() {
        System.out.println("Меня зовут " + name);
    }
}
