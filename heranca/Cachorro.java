package heranca;

public class Cachorro extends Animal{

    public Cachorro(double peso, double altura) {
        super(peso, altura);
    }

    @Override
    public String toString() {
        return  "Eu sou um cachorro au au au";
    }

    public String meu_peso(){
        return "Au au. Meu peso: " + getPeso();
    }
}
