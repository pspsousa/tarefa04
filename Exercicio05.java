package tarefa04;
import java.util.Scanner;
public class Exercicio05 {


public static void main(String[] args) {
	//Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real. O programa deve solicitar o valor da cotação do dólar e também a quantidade de reais disponível com o usuário, para que seja apresentado o valor em moeda americana.	

Scanner scanner = new Scanner(System.in);
System.out.println("Conversor de Real em Dolar");	

System.out.print("Digite o valor da cotação do dólar: ");
float CotacaoDolar = scanner.nextFloat();

System.out.print("Digite a quantidade de reais: ");
float ValorReais = scanner.nextFloat();


float ValorDolar = ValorReais / CotacaoDolar;

System.out.printf("O valor de R$ em dólares é: $ ", ValorDolar);

scanner.close();

	}

}
