package pattern.padraoMemento.main;

import pattern.padraoMemento.memento.TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.setTexto("Hello World");
        textEditor.setTexto("Hello World Erick");
        textEditor.setTexto("Hello World Erick Sena");

        System.out.println(textEditor.recuperarTexto());
        System.out.println(textEditor.recuperarTexto());
        System.out.println(textEditor.recuperarTexto());
    }
}
