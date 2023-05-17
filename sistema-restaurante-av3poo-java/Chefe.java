public class Chefe extends Funcionarios{

    public String cpf;
    public String experienciaGastronomica;
    public String higiene;

    public Chefe(String cpf, String experienciaGastronomica, String higiene) {
        this.cpf = cpf;
        this.experienciaGastronomica = experienciaGastronomica;
        this.higiene = higiene;
    }

public Chefe(){super();}


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getExperienciaGastronomica() {
        return experienciaGastronomica;
    }

    public void setExperienciaGastronomica(String experienciaGastronomica) {
        this.experienciaGastronomica = experienciaGastronomica;
    }

    public String getHigiene() {
        return higiene;
    }

    public void setHigiene(String higiene) {
        this.higiene = higiene;
    }


    @Override
    public void rendaTotal(int rendaBasica, double taxa) {
        super.rendaTotal(rendaBasica, taxa);
        System.out.println("O salário do Chefe é: " + rendaBasica * taxa);
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
        System.out.println("Employee Name: " + nome);
    }

    public static void main(String[] args) throws NullPointerException {

        Chefe object = new Chefe();
        object.getCargaHorario("8h");
        object.getData(14, "Jonas");
        object.rendaTotal(1200, 2.6);
        object.funcaoFuncionario("Cozinhar para os clientes do estabelecimento");
        throw new NullPointerException("error in cadaster");

    }

}



