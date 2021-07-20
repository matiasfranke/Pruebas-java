package OOP.clases.interfaces;


public class TestInterface {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal dog = new Dog();

        pig.animalSound();
        pig.sleep();
        dog.animalSound();
        dog.sleep();
    }
}
