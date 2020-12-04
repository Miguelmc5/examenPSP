import java.util.Scanner;

public class TerceraP extends Thread {

    public void tres(){
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Vuelve a introducir la frase: ");
        frase =sc.nextLine();
        String[] palabras = frase.split(" ");
        for (String palabra : palabras)
        {
            System.out.println(palabras[2]);
        }
    }


}
