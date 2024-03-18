package tarefa04;
import java.util.Scanner;
public class Exercicio06 {
public static void main(String[] args) {

	//Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à soma dos quadrados dos três valores lidos.
	
Scanner scanner = new Scanner(System.in);

System.out.println("Soma dos quadrados dos três valores lidos.");	


System.out.print("Digite o valor de A: ");
float A = scanner.nextFloat();

System.out.print("Digite o valor de B: ");
float B = scanner.nextFloat();

System.out.print("Digite o valor de C: ");
float C = scanner.nextFloat();


double somaQuadrados = Math.pow(A, 2) + Math.pow(B, 2) + Math.pow(C, 2);


System.out.println("A soma dos quadrados dos valores é: " + somaQuadrados);

scanner.close();

	}
}