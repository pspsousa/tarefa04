package tarefa04;

import java.util.Scanner;

public class Exercicio01 {

public static void main(String[] args) {
	//Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, baseando-se na utilização do conceito da propriedade distributiva. Ou seja, se forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, A com C e A com D. Depois B com C, B com D e por fim C com D. Perceba que será necessário efetuar seis operações de adição e seis operações de multiplicação e apresentar doze resultados de saída.
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Calculadora: Variavéis A, B, C e D");
    
    System.out.print("Digite o valor de A: ");
    int A = scanner.nextInt();
    System.out.print("Digite o valor de B: ");
    int B = scanner.nextInt();
    System.out.print("Digite o valor de C: ");
    int C = scanner.nextInt();
    System.out.print("Digite o valor de D: ");
    int D = scanner.nextInt();
    
    int somaAB = A + B;
    int somaAC = A + C;
    int somaAD = A + D;
    int somaBC = B + C;
    int somaBD = B + D;
    int somaCD = C + D;

    int multAB = A * B;
    int multAC = A * C;
    int multAD = A * D;
    int multBC = B * C;
    int multBD = B * D;
    int multCD = C * D;
   
    System.out.println("Adições:");
    System.out.println("A + B = " + somaAB);
    System.out.println("A + C = " + somaAC);
    System.out.println("A + D = " + somaAD);
    System.out.println("B + C = " + somaBC);
    System.out.println("B + D = " + somaBD);
    System.out.println("C + D = " + somaCD);
    
    System.out.println("Multiplicações:");
    System.out.println("A * B = " + multAB);
    System.out.println("A * C = " + multAC);
    System.out.println("A * D = " + multAD);
    System.out.println("B * C = " + multBC);
    System.out.println("B * D = " + multBD);
    System.out.println("C * D = " + multCD);
    
    scanner.close();
}
}


