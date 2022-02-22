package OOP.polimorfismo.sobrecarga;

import OOP.polimorfismo.herencia.Animal;
import OOP.polimorfismo.herencia.Gato;
import OOP.polimorfismo.herencia.Perro;

public class TestSobrecarga {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();

        //       test 1 suma integers
        calculadora.printSuma(2 , 2);
        //       test 2 suma como string
        calculadora.printSuma("2", "2");
        //       test 3 suma q no suma nada... pero suma el ejemplo!
        calculadora.printSuma("ah re que no sumaba!");
    }
}
