package basico.lista7;

public class Pessoa {
    private String nome;
    private Integer anoNasc;

    public Pessoa(String nome, Integer anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getAnoNasc() {
        return anoNasc;
    }
    public void setAnoNasc(Integer anoNasc) {
        this.anoNasc = anoNasc;
    }
}
