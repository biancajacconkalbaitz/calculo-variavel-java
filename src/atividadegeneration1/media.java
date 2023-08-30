package atividadegeneration1;

import java.util.Scanner;
public class media 
public static void main (String [] args) {
Scanner ler = new Scanner (System.in);


float salário;
float abono;

System.out.println ( "\nDigite seu salário; ");
salário = ler.nextFloat();

System.out.println("Digite seu abono: ");
abono = ler.nextFloat();

System.out.printf("Variável salário = %.2f”, salário);
System.out.printf("Variável abono= %.2f", abono);



  }
}
