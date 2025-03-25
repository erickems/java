public class MyClass{

    public static void main(String args []){
        // formas de inicializar um array 
        int xarray[] = {78, 36, 21, 15};
        int[] yarray = {78, 36, 21, 15};

        int[] mArray = new int[3];

        System.out.println("Tamanho do array: " + mArray.length);
        
        for(int i = 0; i < mArray.length; ++i){
            mArray[i] = (1 * i) + 2; 
        }

        int n = 0;
        for (int i : mArray) {
            System.out.println("O elemento na posição " + n + " é: " + i);
            ++n;
        }
    }
}