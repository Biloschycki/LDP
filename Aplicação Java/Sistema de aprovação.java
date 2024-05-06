package fiap;

import java.util.Scanner;

public class Aula04_Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int numeroMatricula = 0, frequencia = 0, contAprov = 0, contReprov = 0, contFreq = 0;
		double resultado = 0, nota1, nota3, nota2;

		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o número da sua matrícula:");
			numeroMatricula = entrada.nextInt();
			System.out.println("Digite a sua primeira nota:");
			nota1 = entrada.nextDouble();
			System.out.println("Digite a sua segunda nota:");
			nota2 = entrada.nextDouble();
			System.out.println("Digite a sua terceira nota:");
			nota3 = entrada.nextDouble();
			System.out.println("Digite a sua frequência:");
			frequencia = entrada.nextInt();

			resultado = (nota1 + nota2 + nota3) / 3;

			System.out.println("Seu número de matrícula: " + numeroMatricula);
			System.out.println("Nota final: " + resultado);
			if (resultado > 6 && frequencia > 40) {
				System.out.println("Aprovado");
				contAprov++;
			} else 
				if (resultado<6) {
				System.out.println("Reprovado");
				contReprov++;
			}else {
				System.out.println("Reprovado por frequencia");
				contFreq++;
			}
		}

		System.out.println("Total de alunos aprovados: " + contAprov);
		System.out.println("Total de alunos reprovados: " + contReprov);
		System.out.println("Total de alunos reprovados por frequência: " + contFreq);

	}// main

}// class
