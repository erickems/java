package pattern.padraoBuilder.main;

import pattern.padraoBuilder.builder.Builder;
import pattern.padraoBuilder.domain.Animal;
import pattern.padraoBuilder.domain.Automovel;
import pattern.padraoBuilder.domain.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Builder()
                .setNome("erick")
                .setSobrenome("sena")
                .setEmail("erick@sena.com")
                .setTelefone("123")
                .builder();

        System.out.println(pessoa.toString());

        pessoa.setAnimal(new Animal("Cata"));
        pessoa.setAutomovel(new Automovel("Fusca"));
    }
}
