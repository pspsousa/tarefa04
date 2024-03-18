package tarefa04;
import java.util.Scanner;
public class Exercicio08 {
public static void main(String[] args) {

	//Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (variáveis A, B, C e D). Ao final o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro valor e o resultado da soma (variável S) do segundo com o quarto valor.

Scanner scanner = new Scanner(System.in);
System.out.println("Calculo de Valores ");	

System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        
System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        
System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();
        
System.out.print("Digite o valor de D: ");
        int D = scanner.nextInt();
       
        int P = A * C;
        int S = B + D;
       
System.out.println("O produto de A e C é: " + P);
System.out.println("A soma de B e D é: " + S);
        
        scanner.close();
    }
}