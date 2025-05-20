package turma20251;

import java.util.ArrayList;
import java.util.List;

public class DAOCliente {
   private List<Cliente> clientes;

   public DAOCliente(){
      clientes=new ArrayList<>();

   }

   public void salvarCliente(Cliente c){
      clientes.add(c);
      System.out.println("Salvando o cliente..."+c.toString());

   }

   public List<Cliente> obterTodos(){
      /*Buscar todos os clientes na tabela do BD e colocar numa lista
     

      Para cada cliente na tabela (laço), fazer isto::
      Cliente c= new Cliente("cliente que veio do BD",0);//pegar valores da tabela e construir o objeto cliente
      clientes.add(c);//acrescentar o objeto à lista de clientes
      */

      return clientes;
   }

 

   public Cliente pesquisarCliente(String nomeCliente){
      /*Buscar na lista de clientes*/
    
      for (Cliente c:clientes) // for (int i=0;i<clientes.size();i++)
         if (nomeCliente.equals(c.getNome())) // if (nomeCliente.equals(clientes.get(i).getNome()))
            return c;
      
      return null;
   }

   //Chamar este método para cadastrar alguns clientes, deixando os testes mais rápidos 
   public void carregarListadeClientes(){
      String nomes[]={"João", "Maria", "Janaína", "Karyne", "Arthur", "Alice", "Igor", "Ronaldo", "Elina"};
      for (String n:nomes){
         Cliente c=new Cliente(n);
         clientes.add(c);
      }

    }

}
