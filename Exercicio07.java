package tarefa04;
import java.util.Scanner;
public class Exercicio07 {
public static void main(String[] args) {

	//Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final o quadrado da soma dos três valores lidos.

Scanner scanner = new Scanner(System.in);
    
System.out.println("Quadrado da soma dos três valores lidos.");	


System.out.print("Digite o valor de A: ");
float A = scanner.nextFloat();   
System.out.print("Digite o valor de B: ");
float B = scanner.nextFloat();   
System.out.print("Digite o valor de C: ");
float C = scanner.nextFloat();  

double Resultado = Math.pow(A + B + C, 2);

System.out.println("O quadrado da soma dos valores é: " + Resultado);
    

    scanner.close();
    
    
	}
}