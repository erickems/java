package pattern.padraoVisitor.domain;

import pattern.padraoVisitor.visitor.Animal;
import pattern.padraoVisitor.visitor.AnimalVisitor;

public class Cachorro implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitCachorro(this);
    }
}
