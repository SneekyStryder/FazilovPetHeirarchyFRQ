public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    public String speak() {
        return super.speak() + "meow";
    }
}