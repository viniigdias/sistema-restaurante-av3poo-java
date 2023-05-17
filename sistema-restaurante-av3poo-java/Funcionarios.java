public abstract class Funcionarios implements Funcao {

    public String nome;
    public String idade;
    public String email;
    public String telefone;

   protected double rendaBasica = 1200;
   public double taxa = 1;


    public Funcionarios(String nome, String idade, String email, String telefone, double rendaBasica, double taxa) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.rendaBasica = rendaBasica;
        this.taxa = taxa;
    }

    public Funcionarios() {

    }

    protected void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public void setRendaBasica(double rendaBasica) {
        this.rendaBasica = rendaBasica;
    }


    @Override
    public void funcaoFuncionario(String funcao) {

    }
    @Override
    public void rendaTotal(int rendaBasica, double taxa){

    }

    @Override
    public void getData(int empId, String nome) {

    }

    @Override
    public void getCargaHorario(String tempo) {

    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rendaBasica=" + rendaBasica +
                '}';
    }

}
