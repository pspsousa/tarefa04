package tarefa04;
import java.util.Scanner;
public class Exercicio10 {

public static void main(String[] args) {

	//Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para cada candidato. Deve ser criado um programa de computador que efetue a leitura da quantidade de votos válidos para cada candidato, além de efetuar também a leitura da quantidade de votos nulos e votos em branco. Ao final o programa deve apresentar o número total de eleitores, considerando votos válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores; e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.

Scanner scanner = new Scanner(System.in);

System.out.println("Apuração de Votos");

System.out.print("Digite os votos válidos para o candidato A: ");
int VotosA = scanner.nextInt();
System.out.print("Digite os votos válidos para o candidato B: ");
int VotosB = scanner.nextInt();
System.out.print("Digite os votos válidos para o candidato C: ");
int VotosC = scanner.nextInt();


System.out.print("Digite  os votos nulos: ");
int VotosNulos = scanner.nextInt();
System.out.print("Digite  os votos em branco: ");
int VotosBrancos = scanner.nextInt();


int Eleitores = VotosA + VotosB + VotosC + VotosNulos + VotosBrancos;
float Validos = (float)(VotosA + VotosB + VotosC) / Eleitores * 100;
float A = (float)VotosA / Eleitores * 100;
float B = (float)VotosB / Eleitores * 100;
float C = (float)VotosC / Eleitores * 100;
float Nulos = (float)VotosNulos / Eleitores * 100;
float Brancos = (float)VotosBrancos / Eleitores * 100;


System.out.println("Número total de eleitores: " + Eleitores);
System.out.printf("Percentual de votos válidos: ", Validos);
System.out.printf("Percentual de votos válidos do candidato A: ", A);
System.out.printf("Percentual de votos válidos do candidato B: ", B);
System.out.printf("Percentual de votos válidos do candidato C: ", C);
System.out.printf("Percentual de votos nulos: ", Nulos);
System.out.printf("Percentual de votos em branco: ", Brancos);

	scanner.close();

	}
}