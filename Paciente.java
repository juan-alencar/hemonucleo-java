public class Paciente {
    private int id;
    private String nome;
    private String tipoSanguineo;
    private int idade;

    public Paciente() {}

    public Paciente(int id, String nome, String tipoSanguineo, int idade) {
        this.id = id;
        this.nome = nome;
        this.tipoSanguineo = tipoSanguineo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
