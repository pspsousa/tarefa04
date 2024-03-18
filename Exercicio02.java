package tarefa04;
import java.util.Scanner;
public class Exercicio02 {


public static void main(String[] args) {
	//Elaborar um programa que calcule e apresente o volume de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
Scanner scanner = new Scanner(System.in);

System.out.println("Calculadora: Volume de caixa");
System.out.print("Digite o comprimento da caixa: ");
float Comprimento = scanner.nextFloat();

System.out.print("Digite a largura da caixa: ");
float Largura = scanner.nextFloat();

System.out.print("Digite a altura da caixa: ");
float Altura = scanner.nextFloat();
float Volume = comprimento * largura * altura;

System.out.printf("O volume da caixa retangular é: " + volume);

scanner.close();
	}
}