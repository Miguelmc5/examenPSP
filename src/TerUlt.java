import java.util.Scanner;

public class TerUlt extends Thread{

    public void terUlt() {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Vuelve a introducir la frase: ");
        frase =sc.nextLine();
        String[] parts = frase.split(" "); String lastWord = parts[parts.length - 1]; System.out.println(lastWord);
}
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
