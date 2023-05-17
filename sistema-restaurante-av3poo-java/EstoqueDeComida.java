public class EstoqueDeComida extends Estoque{

    String verdura;
    String carnes;
    String legumes;

    public EstoqueDeComida(String armazenamento, String qntdDeComida, String ingredientes, String materiais, String verdura, String carnes, String legumes) {
        super(armazenamento, qntdDeComida, ingredientes, materiais);
        this.verdura = verdura;
        this.carnes = carnes;
        this.legumes = legumes;
    }

    public EstoqueDeComida() {
        super();
    }

    public String getVerdura() {
        return verdura;
    }

    public void setVerdura(String verdura) {
        this.verdura = verdura;
    }

    public String getCarnes() {
        return carnes;
    }

    public void setCarnes(String carnes) {
        this.carnes = carnes;
    }

    public String getLegumes() {
        return legumes;
    }

    public void setLegumes(String legumes) {
        this.legumes = legumes;
    }

    @Override
    public void compartimento(String tamanho, String capacidade) {
        super.compartimento(tamanho, capacidade);
        System.out.println("O tamanho do Compartimento e sua capacidade é " + tamanho + ", e sua capacidade é" + capacidade);
    }

    @Override
    public void reeabastecimeto(int dia, String qntd) {
        super.reeabastecimeto(dia, qntd);
        System.out.println("O tempo de reabastecimento é de " + dia  + " dias" + " e a Quantidade é " + qntd);
    }

    public static void main(String[] args) throws NullPointerException {
       EstoqueDeComida estoqueDeComida = new EstoqueDeComida();
       estoqueDeComida.compartimento("400m", " 300 ingredientes e 200 bebidas");
       estoqueDeComida.reeabastecimeto(12, "Bastante");
        throw new NullPointerException("error no Trafego da exportação do produto");
    }
}
