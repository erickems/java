package heranca;

public class Animal {
    private double peso;
    private double altura;

    protected static int campoEstatico = 100; // protected fica visível para outras classes do msm pckg

    public Animal(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double imc(){
        double alturaPotencia = Math.pow(altura,2);
        return (peso / alturaPotencia);
    }

    public static int resultado(int agregado){ // método static modificando atributo static
        Animal.campoEstatico = campoEstatico + agregado;
        return campoEstatico;
    }

    public int teste(){
        return campoEstatico;
    }
}
