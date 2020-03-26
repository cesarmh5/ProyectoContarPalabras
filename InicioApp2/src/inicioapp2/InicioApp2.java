package inicioapp2;

import java.util.Scanner;

public class InicioApp2 {

    static char letra[];
    static int[] contador;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = sc.nextLine();
        //frase = frase.replaceAll(" ","");

        letra  = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
            'w', 'x', 'y', 'z'};
        contador = new int[letra.length];
        
        ContarPalabras.contarpalabras(frase,contador,letra);
        PintarResultados.mostrarResultado(frase);
    }   
}
