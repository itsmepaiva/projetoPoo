import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private String codigoTurma;
    private Disciplina disciplina;
    
    //metodos acessores
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public String getCodigoTurma() {
        return codigoTurma;
    }
    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    //metodos de exemplo para duvida
    /*public void listarTurma(){
        System.out.println("Essa é a turma " + getCodigoTurma());
        System.out.println("O professor responsavel é o professor " + this.professor.nomePessoa);
    }*/


    //metodo construtor
    public Turma(Professor professor, String codigoTurma) {
        this.setProfessor(professor);
        this.setCodigoTurma(codigoTurma);
    }

    //metodos solicitados
   public void adicionarAluno(Aluno a){
    alunos.add(a);
   }

   public void listar(){
    System.out.println("Fazem parte dessa turma os alunos:");
    for (int i = 0; i < alunos.size(); i++) {
       System.out.println(this.alunos.get(i).nomePessoa);
    }
    System.out.println("Fim");
   }

   public void removerAluno(Aluno a){
    alunos.remove(a);
    System.out.println("O aluno foi removido");
   }
}
