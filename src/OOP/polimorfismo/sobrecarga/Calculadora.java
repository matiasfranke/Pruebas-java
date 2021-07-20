package OOP.polimorfismo.sobrecarga;

public class Calculadora {
    public void printSuma(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public void printSuma(String num1, String num2) {
        System.out.println(num1 + " mas " + num2);
    }
    public void printSuma(String reCualquieraNoSumabaNada) {
        System.out.println("no sumo nada, solo imprimo el parámetro: " + reCualquieraNoSumabaNada);

    }

}
