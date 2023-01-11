import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 */

public class Ex2_Consoantes {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] letras = new String[6];
    int quantidadeConsoantes = 0;

    int contador = 0;
    do{
      System.out.println("Letra: ");
      String letra = scan.next();

      if(!(letra.equalsIgnoreCase("a") || 
            letra.equalsIgnoreCase("e") || 
            letra.equalsIgnoreCase("i") || 
            letra.equalsIgnoreCase("o") || 
            letra.equalsIgnoreCase("u"))){
        letras[contador] = letra;
        quantidadeConsoantes++;
      }

      contador++;

    } while(contador < letras.length);

    System.out.print("Consoantes: ");
    for(String consoante : letras) {
      if(consoante != null) {
        System.out.print(consoante + " ");
      }
    }
    
    System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
  }
}
