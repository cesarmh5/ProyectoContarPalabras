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
        
        contarpalabras(frase);
        mostrarResultado(frase);
    }

    private static void contarpalabras(String frase) {
        int numPalabras = 1;
        boolean espaciosSeguidos = false;
        frase = frase.trim();
        for (int i = 0; i < frase.length(); i++) {  
            if (frase.charAt(i) == ' ') {
                if(!espaciosSeguidos){
                 espaciosSeguidos = true;
                numPalabras++;
                }
            } else {
                espaciosSeguidos = false;
            }
            
        }
       System.out.println("Hay " + numPalabras + "  palabras");
       
        int numCaracteres = 0; 
        for (int i = 0; i < frase.length(); i++) {  
            if (frase.charAt(i) != ' ') {
                numCaracteres++;
                }
            }
        System.out.println("Hay " + numCaracteres + " letras");
            
        for (int i = 0; i < frase.length(); i++) {  
                if (frase.charAt(i) != ' ') {
                       for (int j = 0; j < letra.length; j++) {
                           if (frase.charAt(i) == letra[j]) {
                               contador[j]++;
                           }
                       }
                }
            }
        
        
        }
    private static void mostrarResultado(String frase){
        for(int i=0;i<letra.length;i++){
            if(contador[i]!=0){
                System.out.println(letra[i]+" se repite " + contador[i]);
            }
            
        }
    }
       
    
}
