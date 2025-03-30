package Interface;

public class Triangulo implements Figura {

    private float lado1, lado2, lado3;

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public float calcularArea() {
        return lado1 * lado2 * lado3;
    }

    public void imprimir() {
        System.out.println("O perímetro é de " + somaLado());
    }

    public float somaLado() {
        return lado1 + lado2 + lado3;
    }
}
