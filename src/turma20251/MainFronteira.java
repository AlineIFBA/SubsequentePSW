package turma20251;
import java.util.Scanner;

//Classe Boundary (Fronteira)
public class MainFronteira {
  
   private static Scanner input; 
   private static Controle controle;

   public static void main(String args[]) {
      input = new Scanner(System.in);
      controle = new Controle();

      String menu = "0-Sair\n"
              + "1-Cadastrar produto\n"
              + "2-Criar Pedido\n"
              + "3-Imprimir todos os produtos\n"
              + "4-Imprimir todos os pedidos\n"
              + "5-Alterar pedido\n"
              + "6-Alterar produto\n"
              + "7-Listar produtos por preço\n"
              + "8-Buscar pedido por codigo\n"
              + "9-Buscar produto por codigo\n"
              + "Digite a opção desejada:\n";

      String saida = "";
      int opcao = -1;
     
      do {
         
         System.out.print(menu);
         opcao = input.nextInt();
         input.nextLine();//Corrigir comportamento inesperado de nextLine();
         switch (opcao) {
            case 1:
               
               System.out.println("Digite o nome do produto:");
               String nome = input.nextLine();
               System.out.println("Digite o preço do produto:");
               double preco = input.nextDouble();
               input.nextLine();
               controle.cadastrarProduto(nome, preco);
               break;
            case 2:
               System.out.println("Digite o nome do Cliente:");
               String nomeCliente = input.nextLine();
               controle.criarPedido(nomeCliente);
            break;
 
            case 3:
               String resultado=controle.imprimirProdutos();
               System.out.println(resultado);
               break;
            case 4:
               
               break;
            case 5:
               
               break;
            case 6:
              
               
               break;
            case 7:
               
               break;
            case 8:
             
               break;
            case 9:
               
              
               break;
            case 10:
               break;
               
         }
         
      } while (opcao != 0);
      
   }

         
   
}
