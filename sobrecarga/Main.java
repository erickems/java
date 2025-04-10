package sobrecarga;

public class Main {
    public static void main(String[] args) {
        System.out.println(Estudante.getNumero_estudante(2., 5));
        System.out.println(Estudante.getNumero_estudante(4, 3.));

        System.out.println("\n" + "Sobrecarga com parâmetro de tipos diferentes: \n");
        System.out.println(Estudante.sobrecarga("String"));
        System.out.println(Estudante.sobrecarga(2));
    }
}

class Estudante{
    private static int numero_estudante;

    public Estudante(){
        numero_estudante++;
    }

    public static int getNumero_estudante(double valor, int num) {
        return (int) valor + num;
    }

    public static int getNumero_estudante(int num, double valor){
        return (int) valor + num;
    }

    public static String sobrecarga(String sobrecarga){
        return "Sobrecarga com " + sobrecarga;
    }

    public static String sobrecarga(int num){
        return "Sobrecarga com inteiro " + num;
    }
}
