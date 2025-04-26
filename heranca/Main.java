package heranca;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Main {

    static void print(Animal animal) {
        System.out.println(animal.toString());
    }

    public static void main(String[] args) {

        Animal animal = new Animal(60, 1.80);

        System.out.println(Animal.resultado(50)); //método static sendo chamado diretamente pela classe
        System.out.println(animal.resultado(-10)); //método static pode ser chamado pela instância
        System.out.println(animal.campoEstatico); //intância acessando atributo static

        System.out.println(animal.teste());

        Animal animal2 = new Gato(60, 1.80);
        Animal cachorro = new Cachorro(60, 1.80);

        System.out.println(animal.toString());
        System.out.println(animal2.toString());

        // System.out.println(cachorro.meu_peso());// eu não consigo acessar esse método
        // da subclasse pq ele não foi definido na superclass
        // é preciso fazer downcasting

        Cachorro c = (Cachorro) cachorro;
        System.out.println(c.meu_peso());
    }
}
