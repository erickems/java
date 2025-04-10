package pattern.padraoCommand.command;

import pattern.padraoCommand.receiver.Lampada;

public class Ligar implements Command {
    Lampada lampada;

    public Ligar(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        this.lampada.ligar();
    }
}