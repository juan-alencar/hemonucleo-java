public class Doador {
    private String nome;
    private String tipoSanguineo;
    private int id;
    private int idade;

    public Doador() {
    }

    public Doador(String nome, String tipoSanguineo, int id, int idade) {
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
        this.id = id;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return
                "[ID: " + id +
                        ", Nome: " + nome +
                        ", Idade: " + idade +
                        ", Tipo Sanguineo: " + tipoSanguineo +
                        ']';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
