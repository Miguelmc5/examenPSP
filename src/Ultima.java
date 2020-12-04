import java.util.Scanner;

public class Ultima  extends Thread{

    public void terUlt() {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Vuelve a introducir la frase: ");
        frase =sc.nextLine();
        String[] parts = frase.split(" "); String lastWord = parts[parts.length - 1];
        lastWord.getBytes();
    }




}
