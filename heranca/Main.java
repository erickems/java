package heranca;

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

        System.out.println(Animal.resultado(50)); //método static sendo chamado diretamente pela classe
        System.out.println(animal.resultado(-10)); //método static pode ser chamado pela instância
        System.out.println(animal.campoEstatico); //intância acessando atributo static

        Main.mvoid();
        //Main.normal(); isso dá erro
        m.normal();
        System.out.println(animal.teste());

        Animal animal2 = new Gato(60, 1.80);
        animal = animal2;
        Animal animal3 = new Cachorro(60, 1.80);

        System.out.println(animal.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());
    }
}
