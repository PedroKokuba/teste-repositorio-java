package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b;

		System.out.println("Digite o 1° valor: ");
		a = scan.nextInt();
		System.out.println("Digite o 2° valor: ");
		b = scan.nextInt();

		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplcacao = multiplicacao(a, b);
		double divisao = divisao(a, b);

		System.out.println("Resultado da soma é: " + soma);
		System.out.println("Resultado da subtração é: " + subtracao);
		System.out.println("Resultado da multiplicação é: " + multiplcacao);
		System.out.println("Resultado da divisão é: " + divisao);
	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

}
