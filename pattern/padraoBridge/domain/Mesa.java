package pattern.padraoBridge.domain;

import pattern.padraoBridge.bridge.Cor;
import pattern.padraoBridge.bridge.Movel;

public class Mesa extends Movel {

    public Mesa(Cor cor) {
        super(cor);
    }

    @Override
    public String pinta() {
        return "Mesa de cor " + this.cor.pinta();
    }
}
