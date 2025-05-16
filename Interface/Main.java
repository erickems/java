package Interface;

import java.util.ArrayList;

public class Main {

    public static void figuras(Figura f){
        System.out.println(f.toString());
    }

    public static void main(String[] args) {
        Figura t = new Triangulo();
        t.print();

        Figura c = new Circulo();
        c.print();

        Triangulo tt = new Triangulo();
        tt = (Triangulo) t;

        figuras(t);
        figuras(c);
        figuras(tt);
        
        String texto = "";
        
        String x = (texto == "Triangulo") ? "Sim" : "Não";
    }
}
