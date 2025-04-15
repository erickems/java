package pattern.padraoCommand.client;

import pattern.padraoCommand.command.Command;
import pattern.padraoCommand.command.Desligar;
import pattern.padraoCommand.command.Ligar;
import pattern.padraoCommand.invoker.Controle;
import pattern.padraoCommand.receiver.Lampada;

public class Main {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        Command butao1 = new Ligar(lampada);
        Command butao2 = new Desligar(lampada);

        Controle controle = new Controle();

        controle.execute(butao1);
        controle.execute(butao2);
        controle.execute(butao1);
        controle.execute(butao2);
    }
}
