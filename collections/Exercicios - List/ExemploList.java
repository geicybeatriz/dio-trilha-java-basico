package exemplos_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
  
  public static void main(String[] args) {
    //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

    // 1. Crie uma lista e adicione as 7 notas:
    List<Double> notas = new ArrayList<Double>();
    notas.add(7d);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5d);
    notas.add(7d);
    notas.add(0d);
    notas.add(3.6);
    //System.out.println(notas);

    // 2. Exiba a posição do elemento 5.0 na lista
    //System.out.println("Posição do valor 5.0: " + notas.indexOf(5.0));

    // 3. Adicione na lista a nota 8.0 na posição 4
    notas.add(4, 8d);
    System.out.println(notas);

    // 4. Substitua a nota 5.0 pela nota 6.0
    notas.set(notas.indexOf(5d), 6d);

    // 5. Confira se a nota 5.0 está na lista
    System.out.println("A nota 5.0 está na lista? " + notas.contains(5d));

    // 6. Exiba todas as notas na ordem em que foram informadas
    System.out.println(notas);

    // 7. Exiba a terceira nota adicionada
    System.out.println(notas.get(2));

    // 8. Exiba a menor nota
    System.out.println("Menor nota: " + Collections.min(notas));

    // 9. Exiba a maior nota:
    System.out.println("Maior nota: " + Collections.max(notas));

    // 10. Exiba a soma dos valores
    Iterator<Double> iterator = notas.iterator();
    Double soma = 0d;
    while(iterator.hasNext()){
      Double next = iterator.next();
      soma += next;
    }
    System.out.println("Somatório: " + soma);

    // 11. Exiba a média das notas
    System.out.println("Média: " + (soma / notas.size()));

    // 12. Remova a nota 0:
    notas.remove(0d);
    System.out.println(notas.toString());

    // 13. Remova a nota na posição 0
    notas.remove(0);
    System.out.println(notas.toString());

    // 14. Remova as notas menores que 7
    Iterator<Double> iterator1 = notas.iterator();
    while(iterator1.hasNext()){
      Double next = iterator1.next();
      if(next < 7d) iterator1.remove();
    }
    System.out.println(notas);

    // 15. Apague toda a lista
    notas.clear();
    System.out.println(notas);

    // 16. Confira se a lista está vazia
    System.out.println("A lista está vazia? " + notas.isEmpty());
  }
}
