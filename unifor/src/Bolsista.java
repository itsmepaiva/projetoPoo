public class Bolsista extends Aluno {
    private float bolsa;
    
    //metodos acessores
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    //construtor
    public Bolsista(float cpf, String nomePessoa, int idade, int matricula, float bolsa) {
        super(cpf, nomePessoa, idade, matricula);
        setBolsa(bolsa);
    }

    @Override
    public void pagarMensalidade(){
        if(this.bolsa != 0){
            System.out.println("O aluno pagou a mensalidade com o desconto da bolsa");
        }
    }
}
