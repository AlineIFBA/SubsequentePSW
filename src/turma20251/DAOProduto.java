package turma20251;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DAOProduto {
   private List<Produto> produtos;

   public DAOProduto(){
      produtos=new ArrayList<>();

   }

   public void salvarProduto(Produto p){
      produtos.add(p);
      System.out.println("Salvando o produto..."+p.toString());

   }

   

   public List<Produto> obterTodos(){
      /*Buscar todos os produtos na tabela do BD e colocar numa lista:

      Para cada produto na tabela (laço), fazer isto:
      Produto p= new Produto("produto que veio do BD",0);//pegar valores da tabela e construir o objeto produto
      produtos.add(p);//acrescentar o objeto à lista de produtos
      */

      return produtos;
   }

    //Chamar este método para cadastrar alguns clientes, deixando os testes mais rápidos 
    public void carregarListadeProdutos(){
      String nomes[]={"caneta", "borracha", "lápis de cor", "giz pastel", "canetinha", "marcador de quadro", "papel sulfite"};
      Random rand=new Random();
      double preco=0;
      for (String n:nomes){
         int valor=rand.nextInt(50)+1;
         preco=(double)valor;
         Produto p=new Produto(n, preco);
         produtos.add(p);
      }

    }



}
