package pattern.padraoMemento.memento;

public class TextEditor {
    String texto = "";
    Memento memento;

    public TextEditor() {
         super();
    }

    public void setTexto(String texto) {
        this.texto = texto;
        criarSnapshot();
    }

    public String getTexto() {
        return texto;
    }

    public void criarSnapshot(){
        memento = new Memento(this);
    }

    public String recuperarTexto() {
        return memento.getTexto();
    }
}
