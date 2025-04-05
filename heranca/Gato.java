package heranca;

public class Gato extends Animal{

    public Gato(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String toString() {
        return "Eu sou um gato";
    }
}
