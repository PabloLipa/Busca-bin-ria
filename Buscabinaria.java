
import java.util.*;

public class Buscabinaria {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        int tamanho;
        int elemento = 0;
        int p, u = 0;
        int m = 0;
        int variavelencontrada = 0;

        System.out.println("Digite o tamanho do vetor:");
        tamanho = s.nextInt();
        int[] listnum = new int[tamanho];

        if (tamanho > 0) {
            for (int i = 0; i < listnum.length; i++) {
                listnum[i] = i;
                System.err.println(listnum[i]);
            }

            System.out.println("Digite o numero que tu queres do vetor:");
            elemento = s.nextInt();

            p = 0;
            u = tamanho;

            while (p <= u) {
                m = (p + u) / 2;
                if (elemento == listnum[m]) {
                    variavelencontrada = 0;
                    break;
                } else if (elemento < listnum[m]) {
                    u = m;
                    continue;
                } else if (elemento > listnum[m]) {
                    p = m;
                    continue;
                } else {
                    variavelencontrada = 1;
                }
            }
        } else {
            System.out.println("Esse tamanho não é valido");
        }

        if (variavelencontrada == 0) {
            System.out.println("Elemento: " + m + " Esta na posição " + (listnum[m] + 1) + " do vetor!");
        } else {
            System.out.println("Elemento: " + elemento + "não encontrado!");
        }

    }
}