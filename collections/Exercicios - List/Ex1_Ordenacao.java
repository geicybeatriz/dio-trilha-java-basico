package exemplos_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//Dadas as informações sobre meus gatos, crie uma lista e ordene essa lista exibindo : (nome - idade - cor)

//Gato 1 = nome: Sírius, idade: 4, cor: preta
//Gato 2 = nome: Yato, idade:4, cor: frajola
//Gato 3 = nome: Dean, idade: 2, cor: frajola

public class Ex1_Ordenacao {
  
  public static void main(String[] args) {
    List<Gato> meusGatos = new ArrayList<>(){{
      add(new Gato("Sírius", 4, "preta"));
      add(new Gato("Yato", 4, "frajola"));
      add(new Gato("Dean", 2, "frajola"));
    }};

    //1. Mostre a lista pela ordem de inserção
    System.out.println(meusGatos);

    //2. Mostre a lista numa ordem aleatória:
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    //3. Mostre a lista por ordem natural (nome)
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    //4. Ordene a lista pela idade
    //Collections.sort(meusGatos, new ComparatorIdade());
    //ou
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);
    

    //5. Ordene a lista pela cor
    meusGatos.sort(new ComparatorCor());
    System.out.println(meusGatos);

    //6. Ordene a lista nome/cor/idade
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);

  }
}

class Gato implements Comparable<Gato>{
  private String nome;
  private Integer idade;
  private String cor;
  
  //construtor
  public Gato(String nome, int idade, String cor){
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public String getNome(){
    return nome;
  }

  public Integer getIdade(){
    return idade;
  }

  public String getCor(){
    return cor;
  }

  @Override
  public String toString(){
    return "{" + "nome: '" + nome + '\'' + ", idade: '" + idade + '\'' + ", cor: '" + cor + '\'' + '}';
  }

  @Override
  public int compareTo(Gato gato){
    return this.getNome().compareToIgnoreCase(gato.getNome());

  }
}

class ComparatorIdade implements Comparator<Gato>{
  @Override
  public int compare(Gato g1, Gato g2){
    return Integer.compare(g1.getIdade(), g2.getIdade());
  }
}

class ComparatorCor implements Comparator<Gato>{
  @Override
  public int compare(Gato g1, Gato g2){
    return g1.getCor().compareToIgnoreCase(g2.getCor());
  }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
  @Override
  public int compare(Gato g1, Gato g2){
    int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
    if(nome != 0) return nome;

    int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    if(cor != 0) return cor;

    return Integer.compare(g1.getIdade(), g2.getIdade());
  }

}