package OOP.polimorfismo.interfaces;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestInterface {
    public static void main(String[] args) {
        Animal pig = new Pig();
        Animal dog = new Dog();
        List<Animal> animals = Arrays.asList(pig,dog);

       for (Animal animal : animals) {
           animal.speak();
       }
    }
}
