public class Aluno extends Pessoa{
    protected int matricula;
    
    //metodo acessor
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }  
    
    //metodo construtor
    public Aluno(float cpf, String nomePessoa, int idade, int matricula) {
        super(cpf, nomePessoa, idade);
    }

    //metodo solicitado
    public void pagarMensalidade(){

    }
}