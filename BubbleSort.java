import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // BubbleSort com Otimização - Flag de parada
        int[] array = {3, 5, 1, 6, 7, 8};
        int n = array.length;
        boolean trocou;
        int auxiliar;
        int percorrer = 0;
        System.out.println("Array desordenado: " + Arrays.toString(array));
        for(int i = 0; i < n; i++) {
            trocou = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1] ) {
                    auxiliar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = auxiliar;
                    trocou = true;
                }
            }
            percorrer++;
            if (trocou == false) {
                break;
            }
        }
        System.out.println("Array ordenado: " + Arrays.toString(array));
        System.out.println("Quantidade de vezes que percorreu: " + percorrer);
    }
}