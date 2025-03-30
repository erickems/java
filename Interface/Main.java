package Interface;

public class Main {

    public static void main(String[] args) {
        Figura t = new Triangulo(1,2,3);
        t.imprimir();
        System.out.println(t.calcularArea());

        Figura c = new Circulo((float) 5.12);
        c.imprimir();
        System.out.println(c.calcularArea());
    }
}
