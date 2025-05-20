package turma20251;

import java.util.*;
public class Pedido {
   private List<Produto> produtosDoPedido=new ArrayList<>();
   private Cliente cliente;
   private int codigo;
   private static int geradorCodigo=0;


   public Pedido(Cliente cliente) {
      geradorCodigo++;
      this.codigo = geradorCodigo;
      this.cliente = cliente;
   }

   public void adicionarProduto(Produto p){
      produtosDoPedido.add(p);
      
   }

   public void removerProduto(Produto p){
      produtosDoPedido.remove(p);
      
   }

   public List<Produto> getProdutosDoPedido() {
      return produtosDoPedido;
   }


   public void setProdutosDoPedido(List<Produto> produtosDoPedido) {
      this.produtosDoPedido = produtosDoPedido;
   }


   public Cliente getCliente() {
      return cliente;
   }


   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }


   public int getCodigo() {
      return codigo;
   }


   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }


   public static int getGeradorCodigo() {
      return geradorCodigo;
   }


   public static void setGeradorCodigo(int geradorCodigo) {
      Pedido.geradorCodigo = geradorCodigo;
   }

   

   

}

