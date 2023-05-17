public class EstoqueMateriaisDeContrucao extends Estoque{

    String materiaisDeConstrucao;

    public EstoqueMateriaisDeContrucao(String armazenamento, String qntdDeComida, String ingredientes, String materiais, String materiaisDeConstrucao) {
        super(armazenamento, qntdDeComida, ingredientes, materiais);
        this.materiaisDeConstrucao = materiaisDeConstrucao;
    }

    public EstoqueMateriaisDeContrucao() {

    }

    public String getMateriaisDeConstrucao() {
        return materiaisDeConstrucao;
    }

    public void setMateriaisDeConstrucao(String materiaisDeConstrucao) {
        this.materiaisDeConstrucao = materiaisDeConstrucao;
    }

    @Override
    public void reeabastecimeto(int dia, String qntd) {
        super.reeabastecimeto(dia, qntd);
        System.out.println("O tempo de reabastecimento é de " + dia  + " dias" + " e a Quantidade é " + qntd);
    }

    @Override
    public void setMateriais(String materiais) {
        super.setMateriais(materiais);
        System.out.println("Os Materiais de construção necessários são: " + materiais);
    }

    public static void main(String[] args) {
        EstoqueMateriaisDeContrucao estoqueMateriaisDeContrucao = new EstoqueMateriaisDeContrucao();
        estoqueMateriaisDeContrucao.setMateriais("Tijolos, equipamento, argamassa, decoração");
        estoqueMateriaisDeContrucao.reeabastecimeto(30, "Nescessária para contrução");
    }
}
