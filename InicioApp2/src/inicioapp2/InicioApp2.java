package inicioapp2;

import java.util.Scanner;

public class InicioApp2 {

    static char letra[];
    static int[] contador;
    static int numPalabras;
    static int numCaracteres;
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
        
        contarCaracteresTotal(frase);
        contarNumeroPalabras(frase);
        contarTodosCaracteres(frase);
        
        textoCaracteresTotal(numCaracteres);
        textoNumeroPalabras(numPalabras);
        textoTodosCaracteres(contador,letra);
        
    }
    
    private static void contarCaracteresTotal(String frase){
        numCaracteres = 0; 
        for (int i = 0; i < frase.length(); i++) {  
            if (frase.charAt(i) != ' ') {
                numCaracteres++;
                }
            }
        
    }
    
    private static void contarNumeroPalabras (String frase){
        numPalabras = 1;
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
    } 
    
    private static void contarTodosCaracteres(String frase){
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
    
    private static void textoCaracteresTotal(int numCaracteres){
        System.out.println("Hay " + numPalabras + "  palabras");
    }
    
    private static void textoNumeroPalabras(int numPalabras){
        System.out.println("Hay " + numCaracteres + " letras");
    }
    
    private static void textoTodosCaracteres(int[] contador, char[] letra){
        for(int i=0;i<letra.length;i++){
            if(contador[i]!=0){
                System.out.println(letra[i]+" se repite " + contador[i]);
            }
            
        }
    }
     
}
