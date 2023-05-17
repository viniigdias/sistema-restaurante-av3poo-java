public abstract class Estoque implements Armazenamento {
      String armazenamento;
      String qntdDeComida;
      String Ingredientes;
      String materiais;

      public Estoque(String armazenamento, String qntdDeComida, String ingredientes, String materiais) {
            this.armazenamento = armazenamento;
            this.qntdDeComida = qntdDeComida;
            Ingredientes = ingredientes;
            this.materiais = materiais;
      }

      public Estoque() {

      }

      public String getArmazenamento() {
            return armazenamento;
      }

      public void setArmazenamento(String armazenamento) {
            this.armazenamento = armazenamento;
      }

      public String getQntdDeComida() {
            return qntdDeComida;
      }

      public void setQntdDeComida(String qntdDeComida) {
            this.qntdDeComida = qntdDeComida;
      }

      public String getIngredientes() {
            return Ingredientes;
      }

      public void setIngredientes(String ingredientes) {
            Ingredientes = ingredientes;
      }

      public String getMateriais() {
            return materiais;
      }

      public void setMateriais(String materiais) {
            this.materiais = materiais;
      }

      @Override
      public void compartimento(String tamanho, String capacidade) {

      }

      @Override
      public void reeabastecimeto(int dia, String qntd) {

      }

      @Override
      public String toString() {
            return "Estoque{" +
                    "armazenamento='" + armazenamento + '\'' +
                    ", qntdDeComida='" + qntdDeComida + '\'' +
                    ", Ingredientes='" + Ingredientes + '\'' +
                    ", materiais='" + materiais + '\'' +
                    '}';
      }
}
