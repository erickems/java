package pattern.padraoBridge.main;

import pattern.padraoBridge.bridge.Cor;
import pattern.padraoBridge.bridge.Movel;
import pattern.padraoBridge.domain.Amarelo;
import pattern.padraoBridge.domain.Azul;
import pattern.padraoBridge.domain.Cadeira;
import pattern.padraoBridge.domain.Mesa;

public class Main {
    public static void main(String[] args) {

        Cor amarelo = new Amarelo();
        Cor azul = new Azul();

        Movel cadeira = new Cadeira(azul);
        Movel mesa = new Mesa(amarelo);

        System.out.println(cadeira.pinta());
        System.out.println(mesa.pinta());
    }
}
