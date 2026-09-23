import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // SelectionSort - Minimização de troca
        int[] array = {3, 5, 1, 6, 7, 8};
        int n = array.length;
        int menor;
        int auxiliar;
        int comparacoes = 0;
        int trocas = 0;
        System.out.println("Array desordenado: " + Arrays.toString(array));
        for(int i = 0; i < n - 1; i++) {
            menor = i;
            for (int j = i + 1; j < n; j++) {
                comparacoes++;
                if (array[j] < array[menor]) {
                    menor = j;
                }
            }
            if (menor != i) {
                auxiliar = array[i];
                array[i] = array[menor];
                array[menor] = auxiliar;
                trocas++;
            }
        }
        System.out.println("Array ordenado: " + Arrays.toString(array));
        System.out.println("Quantidade de comparacoes: " + comparacoes);
        System.out.println("Quantidade de trocas: " + trocas);
    }
}