package turma20251;

public class Cliente {
   private int codigo;
   private String nome;
   private static int geradorCodigo=0;

   

   public Cliente(String nome) {
      geradorCodigo++;
      this.codigo = geradorCodigo;
      this.nome = nome;
   }

   

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }



   public int getCodigo() {
      return codigo;
   }



   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }


   

}

