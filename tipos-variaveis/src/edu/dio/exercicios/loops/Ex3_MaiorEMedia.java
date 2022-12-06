package edu.dio.exercicios.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números.
 */

public class Ex3_MaiorEMedia {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int numero;
    int soma = 0;
    int maior = 0;
    int contador = 0;

    do {
      System.out.println("Número: ");
      numero = scan.nextInt();
      soma += numero;

      if(numero > maior) maior = numero;

      contador++;
    } while(contador < 5);

    System.out.println("Maior: " + maior);
    System.out.println("Média: " + (soma/5));
  }
}
