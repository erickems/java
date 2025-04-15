package pattern.padraoVisitor.domain;

import pattern.padraoVisitor.visitor.Animal;
import pattern.padraoVisitor.visitor.AnimalVisitor;

public class Galinha implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitGalinha(this);
    }
}
