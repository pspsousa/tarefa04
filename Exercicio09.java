package tarefa04;
import java.util.Scanner;
public class Exercicio09 {
public static void main(String[] args) {

	//Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador e também o valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).
Scanner scanner = new Scanner(System.in);

System.out.println("Reajuste Salarial");	


System.out.print("Salário mensal: ");
float Salario = scanner.nextFloat();
        

System.out.print("Percentual de reajuste: ");
float Reajuste = scanner.nextFloat();
        

float NovoSalario = Salario + (Salario * Reajuste / 100);

System.out.printf("O novo salário é: R$ ", NovoSalario);
        
        scanner.close();
    }
}