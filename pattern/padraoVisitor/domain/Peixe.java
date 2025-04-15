package pattern.padraoVisitor.domain;

import pattern.padraoVisitor.visitor.Animal;
import pattern.padraoVisitor.visitor.AnimalVisitor;

public class Peixe implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitPeixe(this);
    }
}
