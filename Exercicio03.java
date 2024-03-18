package tarefa04;
import java.util.Scanner;
public class Exercicio03 {

public static void main(String[] args) {
	//Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.

Scanner scanner = new Scanner(System.in);	

System.out.println("Calculadora: Quadrado da Diferença");

System.out.print("Digite o valor de A: ");
int A = scanner.nextInt();
        
System.out.print("Digite o valor de B: ");
int B = scanner.nextInt();

int resultado = (A - B) * (A - B);
 
System.out.println("O resultado do quadrado da diferença do primeiro para o segundo é: " + resultado);
        
        
scanner.close();

    }
}
