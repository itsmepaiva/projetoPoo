public class Visitante extends Pessoa{

    //construtor
    public Visitante(float cpf, String nomePessoa, int idade) {
        super(cpf, nomePessoa, idade);
    }

    //metodo extra
    public void iniciarVisita(){
        System.out.println(this.getNomePessoa() + " está visitando o campus.");
    }
}
