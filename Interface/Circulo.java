package Interface;

public class Circulo implements Figura {

    @Override
    public void print() {
        System.out.println("Circulo");
    }

    public void meuMetodo(){
        System.out.println("Sou um Circulo");
    }
}
