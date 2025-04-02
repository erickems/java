package pattern.padraoBuilder.domain;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private Animal animal;
    private Automovel automovel;

    public Pessoa(){
        super();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    @Override
    public String toString() {
        String retorno = "";
        if(animal != null){
            return nome + " " + sobrenome + " " + telefone + " " + email + " " + animal.nome + " " + automovel.nome;
        } else{
            return nome + " " + sobrenome + " " + telefone + " " + email;
        }
    }
}
