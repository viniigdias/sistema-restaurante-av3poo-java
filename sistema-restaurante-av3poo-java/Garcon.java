public class Garcon extends Funcionarios{

    public Garcon() {
        super();

    }

    @Override
    public void rendaTotal(int rendaBasica, double taxa) {
        super.rendaTotal(rendaBasica, taxa);
        System.out.println("O salário do Garçon é: " + rendaBasica * taxa);
    }



    @Override
    public void funcaoFuncionario(String funcao) {
        super.funcaoFuncionario(funcao);
        System.out.println("Sua Função é: " + funcao);
    }

    @Override
    public void getCargaHorario(String tempo) {
        super.getCargaHorario(tempo);
        System.out.println("Sua carga Horária é: " + tempo);
    }

    @Override
    public void getData(int empId, String nome) {
        super.getData(empId, nome);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + nome);
    }

    @Override
    public String toString() {
        return "Garcon{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rendaBasica=" + rendaBasica +
                ", taxa=" + taxa +
                '}';
    }

    public static void main(String[] args) throws NullPointerException{
        Garcon object = new Garcon();
        object.getData(12, "Joe");
        object.rendaTotal(1200, 1.8);
        object.getCargaHorario("8h");
        object.funcaoFuncionario(" Atender os clientes e levar seus pedidos até o Chefe de cozinha");
        throw new NullPointerException("error in cadaster");
 }
}

