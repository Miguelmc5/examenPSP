import java.util.Scanner;
import java.util.StringTokenizer;

public class HiloPalabras extends  Thread {

    public void palabras() {
    Scanner sc = new Scanner(System.in);
    String frase;
    System.out.println("Vuelve a introducir la frase: ");
    frase =sc.nextLine();
    StringTokenizer st = new StringTokenizer(frase);
       System.out.println("Número de palabras: "+st.countTokens());
}


}
