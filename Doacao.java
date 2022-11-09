import java.util.Date;

public class Doacao {
    private Doador doador;
    private Paciente paciente;
    private Profissional profissional;
    private Date dataDoacao;
    private int id;

    public Doacao() {}
    public Doacao(Doador doador, Paciente paciente, Profissional profissional, Date dataDoacao, int id) {
        this.doador = doador;
        this.paciente = paciente;
        this.profissional = profissional;
        this.dataDoacao = dataDoacao;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "[ID: " + id +
                        ", Paciente: " + paciente.getNome() +
                        ", Doador: " + doador.getNome() +
                        ", Profissional: " + profissional.getNome() +
                        ", Data: " + dataDoacao.getDay() + "/" + dataDoacao.getMonth() + "/" + dataDoacao.getYear() +
                        ']';
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
