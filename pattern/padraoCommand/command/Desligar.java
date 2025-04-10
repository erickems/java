package pattern.padraoCommand.command;

import pattern.padraoCommand.receiver.Lampada;

public class Desligar implements Command {
    Lampada lampada;

    public Desligar(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        this.lampada.desligar();
    }
}