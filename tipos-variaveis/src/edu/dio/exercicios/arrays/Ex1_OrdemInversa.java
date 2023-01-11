
/*
 * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
  public static void main(String[] args) {
    int[] vetor = {7, 23, 9, -4, 5, 1}; 

    System.out.println("Vetor: ");

    //do inicio ao fim
    // int contador = 0;
    // while(contador < (vetor.length)){
    //   System.out.print(vetor[contador] + " ");
    //   contador++;
    // }

    for(int i = vetor.length-1; i >= 0; i--){
      System.out.print(vetor[i] + " ");
    }
  }
}
