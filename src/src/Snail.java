public class Snail extends Animal{
    public Snail(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Sniff! Sniff!");
    }
}
