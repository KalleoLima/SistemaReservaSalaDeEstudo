import br.com.kalleo.AgendaSala;
import br.com.kalleo.CadastrarSalas;
import br.com.kalleo.LogicaSala;
import br.com.kalleo.Usuario;

public class Main {
    public static void main(String[] args) {

        //Usuários
        Usuario usuario1 = new Usuario();
        usuario1.setNome("kalleo");
        usuario1.setCpf(123);

        Usuario usuario2 = new Usuario();
        usuario2.setNome("leo");
        usuario2.setCpf(1244);

        // Salas
        CadastrarSalas sala123 = new CadastrarSalas();
        sala123.setNameSala("sala 123");

        CadastrarSalas sala334 = new CadastrarSalas();
        sala334.setNameSala("sala 334");

        CadastrarSalas sala444 = new CadastrarSalas();
        sala444.setNameSala("sala 444");

        //Lógica de salas e agenda
        LogicaSala logica = new LogicaSala();
        LogicaSala logica2 = new LogicaSala();
        AgendaSala agenda = new AgendaSala();

        //Cadastro das salas
        System.out.println("CADASTRO SALAS");

        logica.CadastrandoSala(sala334);
        logica.CadastrandoSala(sala444);
        logica2.CadastrandoSala(sala123);

        // Salas disponíveis antes das reservas
        System.out.println("\nSALAS DISPONÍVEIS");
        logica.SalasDisponiveis();

        //  Reservas de salas
        logica2.escolherSala("sala 123");
        logica.escolherSala("sala 444");

        //  Salas disponíveis após reservas
        System.out.println("\nSALAS DISPONÍVEIS (APÓS RESERVAS)");
        logica.SalasDisponiveis();

        //  Salas indisponíveis
        System.out.println("\nSALAS INDISPONÍVEIS");
        logica.SalasIndisponiveis();

        //  Agenda das salas
        System.out.println("\nAGENDA");
        agenda.salasAgendadas(usuario1, logica);
        agenda.salasAgendadas(usuario2, logica2);
    }
}
