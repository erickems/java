package pattern.padraoMemento.memento;

import pattern.padraoMemento.domain.Keeper;

public class Memento {
    String texto = ""  ;

    public Memento(TextEditor estado) {
        this.texto = estado.getTexto();
        this.salvar(texto);
    }

    public void salvar(String texto) {
        Keeper.salvar(this);
    }

    public String getTexto() {
        return Keeper.getTexto().texto;
    }
}
