public class Regular extends Aluno {
    //metodo construtor
    public Regular(float cpf, String nomePessoa, int idade, int matricula) {
        super(cpf, nomePessoa, idade, matricula);
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("O aluno pagou o valor integral da mensalidade.");
    }

}
