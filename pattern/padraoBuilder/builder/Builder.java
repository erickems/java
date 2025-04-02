package pattern.padraoBuilder.builder;

import pattern.padraoBuilder.domain.Animal;
import pattern.padraoBuilder.domain.Automovel;
import pattern.padraoBuilder.domain.Pessoa;

public class Builder {

    Pessoa pessoa;

    public Builder() {
         pessoa = new Pessoa();
    }

    public Builder setNome(String nome) {
        pessoa.setNome(nome);
        return this;
    }

    public Builder setSobrenome(String sobrenome) {
        pessoa.setSobrenome(sobrenome);
        return this;
    }

    public Builder setEmail(String email) {
        pessoa.setEmail(email);
        return this;
    }

    public Builder setTelefone(String telefone) {
        pessoa.setTelefone(telefone);
        return this;
    }

    public Builder setAnimal(Animal animal) {
        pessoa.setAnimal(animal);
        return this;
    }

    public Builder setAutomovel(Automovel automovel) {
        pessoa.setAutomovel(automovel);
        return this;
    }

    public Pessoa builder() {
        return pessoa;
    }
}
