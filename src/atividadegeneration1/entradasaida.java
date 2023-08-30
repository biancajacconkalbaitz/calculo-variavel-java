package atividadegeneration1;

import java.util.Scanner;

public class entradasaida {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);


	float salario;
	float abono;

	System.out.println ("Digite seu salário: ");
	salario = ler.nextFloat();

	System.out.println("Digite seu abono: ");
	abono = ler.nextFloat();


float novoSalario = salario + abono;
 System.out.printf("O novo salário será: %.2f", novoSalario);
ler.close();

	  
	}

}
