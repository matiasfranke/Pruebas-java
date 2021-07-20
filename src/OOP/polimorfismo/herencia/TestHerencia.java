package OOP.polimorfismo.herencia;

import OOP.clases.abstracta.CajaAhorro;
import OOP.clases.abstracta.Cuenta;
import OOP.clases.abstracta.CuentaCorriente;

public class TestHerencia {
    public static void main(String[] args) {
       Animal animal = new Animal();
       Animal perro = new Perro();
       Animal gato = new Gato();
        //       test 1 piso patita clase generica
        animal.pisoPatita();
        //       test 2 piso patita clase Gato
        gato.pisoPatita();
        //       test 3 piso patita clase Perro
        perro.pisoPatita();
    }
}
