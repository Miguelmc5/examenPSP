import java.util.Scanner;
import java.util.StringTokenizer;

public class contadores {

    String texto;
    public int contadorLetras=0;
    public int contadorPalabras=0;

    public contadores(String texto1){
        this.texto=texto1;
    }

    public synchronized void añadir() {

        contadorLetras++;
        contadorPalabras++;
        notifyAll();
    }


   /* public void tres(){
        String[] palabras = texto.split(" ");
        for (String palabra : palabras)
        {
            System.out.println(palabras[3]);
        }
    }*/

    public void contarLetras(char a, char e, char i, char o, char u, char A, char E, char I, char O, char U, char b, char c, char d, char f, char g, char h, char j, char k, char l, char m,char n, char p, char q, char r, char s, char t, char v, char w, char x, char y,char z,char B, char C, char D, char F, char G, char H, char J, char K, char L, char M,char N, char P, char Q, char R, char S, char T, char V, char W, char X, char Y,char Z){

        for (int letra = 0; letra< texto.length(); letra++){

            if (texto.charAt(letra)==a|| texto.charAt(letra)==A|| texto.charAt(letra)==e|| texto.charAt(letra)==E|| texto.charAt(letra)==i|| texto.charAt(letra)==I|| texto.charAt(letra)==o|| texto.charAt(letra)==O|| texto.charAt(letra)==u|| texto.charAt(letra)==U|| texto.charAt(letra)==b|| texto.charAt(letra)==c|| texto.charAt(letra)==d|| texto.charAt(letra)==f||texto.charAt(letra)==g|| texto.charAt(letra)==h|| texto.charAt(letra)==j|| texto.charAt(letra)==k||texto.charAt(letra)==l|| texto.charAt(letra)==m|| texto.charAt(letra)==n|| texto.charAt(letra)==p||texto.charAt(letra)==q|| texto.charAt(letra)==r|| texto.charAt(letra)==s|| texto.charAt(letra)==t||texto.charAt(letra)==v|| texto.charAt(letra)==w|| texto.charAt(letra)==x|| texto.charAt(letra)==y||texto.charAt(letra)==z||texto.charAt(letra)==B|| texto.charAt(letra)==C|| texto.charAt(letra)==D|| texto.charAt(letra)==F||texto.charAt(letra)==G|| texto.charAt(letra)==H|| texto.charAt(letra)==J|| texto.charAt(letra)==K||texto.charAt(letra)==L|| texto.charAt(letra)==M|| texto.charAt(letra)==N|| texto.charAt(letra)==P||texto.charAt(letra)==Q|| texto.charAt(letra)==R|| texto.charAt(letra)==S|| texto.charAt(letra)==T||texto.charAt(letra)==V|| texto.charAt(letra)==W|| texto.charAt(letra)==X|| texto.charAt(letra)==Y||texto.charAt(letra)==Z){
                añadir();
            }
        }
    }
    public void cuantasLetras(){
        System.out.println("El numero de letras en la frase es de :"+contadorLetras);

    }




















}
