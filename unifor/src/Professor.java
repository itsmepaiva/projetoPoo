public class Professor extends Pessoa{
    protected String centro;
   
    //metodo acessor
    public String getCentro() {
        return centro;
    }
    public void setCentro(String centro) {
        this.centro = centro;
    }

    //metodo solicitado
    public void darAula(){
        System.out.println("O professor " + this.getNomePessoa() + " está dando aula");
    }
    
    //metodo construtor 
    public Professor(float cpf, String nomePessoa, int idade, String centro) {
        super(cpf, nomePessoa, idade);
        setCentro(centro);
    }

}
