package herança;

public class Main {

    void normal(){
        System.out.println("Método normal");
    }
    static void mvoid(){
        System.out.println("Método static");
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(Animal.campoEstatico);

        Animal animal = new Animal(60, 1.80);
        System.out.println(animal.imc());

        System.out.println(Animal.resultado(50));
        System.out.println(animal.campoEstatico);

        Main.mvoid();
        m.normal();
        System.out.println(animal.teste());
    }
}
