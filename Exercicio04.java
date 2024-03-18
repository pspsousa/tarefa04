package tarefa04;
import java.util.Scanner;
public class Exercicio04 {

public static void main(String[] args) {
	//Elaborar um programa que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.
Scanner scanner = new Scanner(System.in);
	        
System.out.println("Conversor de Dolar para Real");

System.out.print("Digite o valor da cotação do dólar: ");
float CotacaoDolar = scanner.nextFloat();

System.out.print("Digite a quantidade de dólares: ");
float ValorDolar = scanner.nextFloat();
	        

float ValorReais = ValorDolar * CotacaoDolar;
	        

System.out.printf("O valor de dólares em reais é: R$ ", ValorDolar, ValorReais);

	        
scanner.close();
	
    }
}