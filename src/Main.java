import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        System.out.println("mete la frase de la que quieras saber las palabras");
        Scanner sc= new Scanner(System.in);
        String fraseAnalizar=sc.nextLine();
        System.out.println(" ");
        StringTokenizer st = new StringTokenizer(fraseAnalizar);

        contadores numeroDeLetras=new contadores(fraseAnalizar);


        HiloLetras numL = new HiloLetras(numeroDeLetras);
        HiloPalabras numP =new HiloPalabras();
        TerceraP terceraP = new TerceraP();
        TerUlt ter_ult=new TerUlt();



        terceraP.start();
        terceraP.tres();
        terceraP.join();

        numL.start();
        numL.join();


        numP.start();
        numP.join();

        ter_ult.start();
        ter_ult.terUlt();
        ter_ult.join();


        numeroDeLetras.cuantasLetras();
        numP.palabras();

    }
}
