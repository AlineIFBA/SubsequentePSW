package turma20251;

import java.util.List;

public class Controle {
   private DAOProduto daoProduto;
   private DAOCliente daoCliente;
   private DAOPedido daoPedidos;

   public Controle(){
      daoProduto=new DAOProduto();//responsável pela persistência de produtos
      daoCliente=new DAOCliente();//responsável pela persistência de clientes
   }

   public void cadastrarProduto(String nome, double preco){
      Produto p=new Produto(nome, preco);
      daoProduto.salvarProduto(p);

   }

   public void criarPedido(String nomeCliente){
      Cliente cliente=daoCliente.pesquisarCliente(nomeCliente);
      if (cliente==null){
         cliente=new Cliente(nomeCliente);
      }
         Pedido p=new Pedido(cliente);         
      }
      
   

   public String imprimirProdutos(){
      List<Produto> listaProdutos=daoProduto.obterTodos();
      String saida="Produtos cadastrados:";
      for(Produto p:listaProdutos){
         saida=saida+ p.toString()+"\n";
      }
      return saida;
   }



}

