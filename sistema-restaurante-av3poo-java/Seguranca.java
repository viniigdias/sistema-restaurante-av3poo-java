public class Seguranca extends Funcionarios {

    public Seguranca() {
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
        object.getData(2, "Jarbas");
        object.rendaTotal(1200, 1.9);
        object.getCargaHorario("6h");
        object.funcaoFuncionario("Averiguar de que todo local esta seguro");
        throw new NullPointerException("error in cadaster");
    }
}
