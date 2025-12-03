package br.com.kalleo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LogicaSala {
    Set<CadastrarSalas> nomesDaSalas = new LinkedHashSet<>();
    Set<String> SalasInativas = new LinkedHashSet<>();
    Set<String> SalasDisponiveis = new LinkedHashSet<>();
    private String inativas;

    public void CadastrandoSala(CadastrarSalas cadastroSala) {
        String marcador = "[ ]";
        if (cadastroSala == null || cadastroSala.getNameSala().isEmpty()) {
        } else {
            nomesDaSalas.add(cadastroSala);
            SalasDisponiveis.add(marcador + cadastroSala.getNameSala());
        }

    }

    public void escolherSala(String resposta) {
        if (nomesDaSalas == null || nomesDaSalas.isEmpty()) {
            return;
        }
        nomesDaSalas.stream().forEach(x -> {
            String marcador = "[X]";
            if (resposta.equalsIgnoreCase(x.getNameSala())) {

                SalasInativas.add(marcador + x.getNameSala());
                SalasDisponiveis.remove("[ ]" + x.getNameSala());
                inativas = x.getNameSala();
                return ;
            }
        });
    }

    public void SalasDisponiveis(){

  SalasDisponiveis.stream().forEach(s -> System.out.println(s));
    }
    public void SalasIndisponiveis(){
        SalasInativas.stream().forEach(x-> System.out.println(x));
    }


    public String getInativas() {
        return inativas;
    }

    public void setInativas(String inativas) {
        this.inativas = inativas;
    }

    @Override
    public String toString() {
        return "LogicaSala{" +
                "nomesDaSalas=" + nomesDaSalas +
                ", SalasInativas=" + SalasInativas +
                ", SalasDisponiveis=" + SalasDisponiveis +
                ", inativas='" + inativas + '\'' +
                '}';
    }
}


