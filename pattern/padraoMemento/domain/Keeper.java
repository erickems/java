package pattern.padraoMemento.domain;

import pattern.padraoMemento.memento.Memento;

import java.util.*;

public class Keeper {
    static Stack<Memento> mementos = new Stack<>() {
    };

    public static void salvar(Memento m) {
        mementos.push(m);
    }

    public static Memento getTexto() {
        return mementos.pop();
    }
}
