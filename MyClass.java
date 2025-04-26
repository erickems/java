import Interface.Circulo;
import Interface.Figura;
import Interface.Triangulo;
import heranca.Animal;
import sobrecarga.Pessoa;

import java.util.ArrayList;

public class MyClass {

    public void sla(Figura f){
        f.print();
    }

    public static void main(String args []){

        // o java entende que c é do tipo de Figura, mesmo não sendo criado como um tipo
        Circulo c = new Circulo();

        MyClass mc = new MyClass();
        mc.sla(c);
    }
}