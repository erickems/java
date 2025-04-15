package pattern.padraoVisitor.main;

import pattern.padraoVisitor.domain.Cachorro;
import pattern.padraoVisitor.domain.Galinha;
import pattern.padraoVisitor.domain.Peixe;
import pattern.padraoVisitor.visitor.Animal;
import pattern.padraoVisitor.visitor.AnimalVisitor;
import pattern.padraoVisitor.visitor.Comer;
import pattern.padraoVisitor.visitor.Pular;

public class Main {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal peixe = new Peixe();
        Animal galinha = new Galinha();

        AnimalVisitor comer = new Comer();

        cachorro.accept(comer);
        galinha.accept(comer);
        peixe.accept(comer);

        AnimalVisitor pular = new Pular();

        cachorro.accept(pular);
        galinha.accept(pular);
        peixe.accept(pular);
    }
}
