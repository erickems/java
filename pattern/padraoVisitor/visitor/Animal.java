package pattern.padraoVisitor.visitor;

public interface Animal {
    void accept(AnimalVisitor visitor);
}
