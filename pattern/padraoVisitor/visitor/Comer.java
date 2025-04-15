package pattern.padraoVisitor.visitor;

import pattern.padraoVisitor.domain.Cachorro;
import pattern.padraoVisitor.domain.Galinha;
import pattern.padraoVisitor.domain.Peixe;

public class Comer implements AnimalVisitor {
    @Override
    public void visitCachorro(Cachorro cachorro) {
        System.out.println("Comendo osso");
    }

    @Override
    public void visitGalinha(Galinha galinha) {
        System.out.println("Comendo milho");
    }

    @Override
    public void visitPeixe(Peixe peixe) {
        System.out.println("Comendo ração");
    }
}
