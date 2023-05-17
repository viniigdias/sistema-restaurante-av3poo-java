public class Gerente extends Funcionarios {

    public Gerente() {
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
        System.out.println("Sua Função e´: " + funcao);
    }

    @Override
    public void getCargaHorario(String tempo) {
        super.getCargaHorario(tempo);
        System.out.println("Sua carga Horaria é: " + tempo);
    }

    @Override
    public void getData(int empId, String nome) {
        super.getData(empId, nome);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + nome);    }

    @Override
    public String toString() {
        return "Gerente{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rendaBasica=" + rendaBasica +
                ", taxa=" + taxa +
                '}';
    }

    public static void main(String[] args) throws NullPointerException {
        Gerente object = new Gerente();
        object.getData(22, "Silvio");
        object.rendaTotal(1200, 3.4);
        object.getCargaHorario("8h");
        object.funcaoFuncionario("Gerenciar o Restaurante para com que haja uma melhor organização");
        throw new NullPointerException("error in cadaster");
    }
}
