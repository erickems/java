package sobrecarga;

public abstract class Pessoa {
    public void imprime(){
        System.out.println("imprime");
    }

    public void acao(){
        imprime();
    }
}
