public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }


    //_____________________nima______________________
    public String catSays() {
        return getName() + " says: Meow!";
    }
    //_____________________nima______________________


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                '}';
    }
}