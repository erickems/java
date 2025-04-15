package pattern.padraoVisitor.visitor;

import pattern.padraoVisitor.domain.Cachorro;
import pattern.padraoVisitor.domain.Galinha;
import pattern.padraoVisitor.domain.Peixe;

public class Pular implements AnimalVisitor {
    @Override
    public void visitCachorro(Cachorro cachorro) {
        System.out.println("Cachorro pula");
    }

    @Override
    public void visitGalinha(Galinha galinha) {
        System.out.println("Galinha pula");
    }

    @Override
    public void visitPeixe(Peixe peixe) {
        System.out.println("Peixe pula");
    }
}
