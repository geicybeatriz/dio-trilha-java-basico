package edu.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int numero ;
    int quantidade;
    int contador = 0, qtdPares = 0, qtdImpares = 0;

    System.out.println("Quantidade de números: ");
    quantidade = scan.nextInt();

    do {
      System.out.println("Número: ");
      numero = scan.nextInt();
      
      if(numero % 2 == 0) qtdPares++;
      else qtdImpares++;

      contador++;
    } while (contador < quantidade);

    System.out.println("Quantidade de pares: " + qtdPares);
    System.out.println("Quantidade de ímpares: " + qtdImpares);
  }
}
