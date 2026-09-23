import java.util.Arrays;

public class InsertionSort {
    static class Aluno {
        // classe Aluno com nome e nota
        String nome;
        double nota;

        public Aluno (String nome, double nota) {
            this.nome = nome;
            this.nota = nota;
        }

        @Override
        public String toString() {
            return nome + ": " + nota;
        }
    }
    public static void main(String[] args) {
        // Insertion Sort - Lista Parcialmente Ordenada
        Aluno[] lista = {
                new Aluno("Ana", 7.5),
                new Aluno("Carlos", 5.0),
                new Aluno("Clara", 9.2),
                new Aluno("João", 6.5),
                new Aluno("Maria", 10.0)
        };
        int n = lista.length;
        System.out.println("Vetor original: " + Arrays.toString(lista));

        for (int i = 1; i < n; i++) {
            Aluno chave = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j].nota < chave.nota) {
                lista[j + 1] = lista[j];
                j = j - 1;
            }
            lista[j + 1] = chave;
        }

        System.out.println("Vetor com notas em ordem decrescente: " + Arrays.toString(lista));
    }
}