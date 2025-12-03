package br.com.kalleo;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class AgendaSala {
    Set<String> agendados = new LinkedHashSet<>();
    Set<String> guardaSalas = new LinkedHashSet<>();

    public void salasAgendadas(Usuario usuario, LogicaSala lo) {


        agendados.add("Name: " + usuario.getNome() + "\ncpf: " + usuario.getCpf());


        guardaSalas.add("sala do proprietario " + lo.getInativas());

        System.out.println(lo.getInativas());

        // transforma os Sets em Lists para poder usar índice
        List<String> listaAgendados = new ArrayList<>(agendados);
        List<String> listaGuardaSalas = new ArrayList<>(guardaSalas);

        IntStream.range(0, Math.min(listaAgendados.size(), listaGuardaSalas.size()))
                .forEach(i -> {
                    String dadosUsuario = listaAgendados.get(i);
                    String dadosSala = listaGuardaSalas.get(i);

                    // aqui você usa os dois juntos
                    System.out.println(dadosUsuario);
                    System.out.println(dadosSala);
                    System.out.println("----------------");
                });
    }
}
