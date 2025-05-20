package turma20251;

public class Produto {
   private int codigo;
   private String nome;
   private double preco;
   private static int geradorCodigo=0;
   
   public Produto(){
      geradorCodigo++;
      this.codigo = geradorCodigo;
      this.nome = "Não especificado";

   }

   public Produto(String nome, double preco) {
      geradorCodigo++;
      this.codigo = geradorCodigo;
      this.nome = nome;
      this.preco=preco;
      
   }

  
   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }
   public String getNome() {
      return nome;
   }
   public int getCodigo() {
      return codigo;
   }

   @Override
   public String toString() {
      return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
   }

}

