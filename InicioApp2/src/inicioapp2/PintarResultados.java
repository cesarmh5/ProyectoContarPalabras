package inicioapp2;

import static inicioapp2.InicioApp2.contador;
import static inicioapp2.InicioApp2.letra;

public class PintarResultados {

    static void mostrarResultado(String frase) {
        for (int i = 0; i < letra.length; i++) {
            if (contador[i] != 0) {
                System.out.println(letra[i] + " se repite " + contador[i]);
            }

        }
    }
}
