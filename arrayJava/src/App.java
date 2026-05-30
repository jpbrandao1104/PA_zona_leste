import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        //Adiciona elemenetos a list  add()
        nomes.add("Joao");
        nomes.add("Aluno");
       // System.out.println(nomes);

        //Acessar um elemento get(indice)
      //  System.out.println(nomes.get(1));
      nomes.set(1,"fodão");
      //System.out.println(nomes);

      //Remover um item da lista
    nomes.remove(0);
      //System.out.println(nomes);

      //Tamanho da lista
      //System.out.println(nomes.size());

      //Apagar lista
      //nomes.clear();
      //System.out.println(nomes);

      //Verifica se existe
      System.out.println(nomes.contains("fodão"));




    }
}
