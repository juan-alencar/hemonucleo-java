import java.util.Date;
import java.util.Random;

public class Metodos {

    public void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            //  Handle any exceptions.
        }
    }

    ;

    public Doacao newDoacao(Doador doador, Paciente paciente, Profissional profissional) {
        Doacao newDoacao = new Doacao();
        Date date = new Date();
        newDoacao.setId((int) date.getTime());
        newDoacao.setDataDoacao(date);
        newDoacao.setDoador(doador);
        newDoacao.setPaciente(paciente);
        newDoacao.setProfissional(profissional);

        return newDoacao;
    }

    ;

    public Transfusao newTransfusao(Doador doador, Paciente paciente, Profissional profissional) {
        Transfusao newTransfusao = new Transfusao();
        Random random = new Random();
        Date date = new Date();
        newTransfusao.setId((int) date.getTime());
        newTransfusao.setDataTransfusao(date);
        newTransfusao.setDoador(doador);
        newTransfusao.setPaciente(paciente);
        newTransfusao.setProfissional(profissional);

        return newTransfusao;
    }
}
