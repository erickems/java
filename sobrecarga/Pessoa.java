package sobrecarga;

public class Pessoa {

    public String nome = "erick";

    public void imprime(){
        System.out.println(nome);
    }

    public void acao(){
        imprime();
    }
}
