import java.util.Date;

public class Transfusao {
    private Doador doador;
    private Paciente paciente;
    private Profissional profissional;
    private Date dataTransfusao;
    private int id;

    public Transfusao() {}

    public Transfusao(Doador doador, Paciente paciente, Profissional profissional, Date dataTransfusao, int id) {
        this.doador = doador;
        this.paciente = paciente;
        this.profissional = profissional;
        this.dataTransfusao = dataTransfusao;
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "[ID: " + id +
                        ", Paciente: " + paciente.getNome() +
                        ", Doador: " + doador.getNome() +
                        ", Profissional: " + profissional.getNome() +
                        ", Data: " + dataTransfusao.getDay()+"/"+dataTransfusao.getMonth()+"/"+dataTransfusao.getYear()  +
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

    public Date getDataTransfusao() {
        return dataTransfusao;
    }

    public void setDataTransfusao(Date dataTransfusao) {
        this.dataTransfusao = dataTransfusao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
