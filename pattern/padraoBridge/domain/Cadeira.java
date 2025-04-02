package pattern.padraoBridge.domain;

import pattern.padraoBridge.bridge.Cor;
import pattern.padraoBridge.bridge.Movel;

public class Cadeira extends Movel {

    public Cadeira(Cor cor) {
        super(cor);
    }

    public String pinta() {
        return "Cadeira de cor " + this.cor.pinta();
    }
}
