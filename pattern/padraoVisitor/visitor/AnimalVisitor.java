package pattern.padraoVisitor.visitor;

import pattern.padraoVisitor.domain.Cachorro;
import pattern.padraoVisitor.domain.Galinha;
import pattern.padraoVisitor.domain.Peixe;

public interface AnimalVisitor{
    void visitCachorro(Cachorro cachorro);
    void visitGalinha(Galinha galinha);
    void visitPeixe(Peixe peixe);
}
