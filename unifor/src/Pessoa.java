public abstract class Pessoa {
    protected float cpf;
    protected String nomePessoa;
    protected int idade;

    //metodo solicitado
    public final void fazerAniversario(){
        this.idade ++;
        System.out.println(this.getNomePessoa() + " agora tem " + this.getIdade() + " anos de idade");
    }
    
    //metodos acessores
    public float getCpf() { 
        return cpf;
    }

    public void setCpf(float cpf) {
        this.cpf = cpf;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    //metodo construtor
    public Pessoa(float cpf, String nomePessoa, int idade) {
        this.cpf = cpf;
        this.nomePessoa = nomePessoa;
        this.idade = idade;
    }
}
