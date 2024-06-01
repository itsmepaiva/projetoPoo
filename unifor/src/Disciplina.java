public class Disciplina {
    private String codigoDisciplina;
    private String nomeDisciplina;
    private String semestre;
    
    //metodos acessores
    public String getCodigoDisciplina() {
        return codigoDisciplina;
    }
    public void setCodigoDisciplina(String codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    //metodo construtor

    public Disciplina(String codigoDisciplina, String nomeDisciplina, String semestre) {
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.semestre = semestre;
    }
    
}
