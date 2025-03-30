package Interface;

public class Circulo implements Figura {

    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public void imprimir() {
        System.out.println("O perímetro é de: " + Math.sqrt(2*raio));
    }

    @Override
    public float calcularArea() {
        return (float) (3.14 * (Math.sqrt(raio)));
    }
}
