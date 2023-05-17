public class Mercado extends Vendas {

    @Override
    public void marketingDoRestaurante(String propaganda) {
        super.marketingDoRestaurante(propaganda);
        System.out.println("Marketing Digital No Instagram entre outras redes sociais, Nome: " + propaganda);
    }

    @Override
    public void capacidadeLocal(String capacidade) {
        super.capacidadeLocal(capacidade);
        System.out.println("No total a casa/estabelecimento cabem : " + capacidade);
    }

    @Override
    public void organizacaoDosFuncionarios(String organizacao) {
        super.organizacaoDosFuncionarios(organizacao);
        System.out.println("Todos os Funcionarios são organizados : " + organizacao);
    }

    public static void main(String[] args) {
        Mercado mercado = new Mercado();
        mercado.capacidadeLocal("102 pessoas no total");
        mercado.marketingDoRestaurante("@CasaGustoTaíba");
        mercado.organizacaoDosFuncionarios(" controlando apenas o que precisa, todos se ajudando, sempre completando um ciclo");
    }
}
