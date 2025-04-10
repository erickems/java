package pattern.padraoCommand.invoker;

import pattern.padraoCommand.command.Command;

public class Controle {

    public void execute(Command command) {
        command.executar();
    }
}
