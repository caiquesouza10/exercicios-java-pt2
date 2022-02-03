import java.util.Arrays;
import java.util.Scanner;

public class MaiorNumeroNaSequenciaApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String[] valores = string.split(" ");

        int[] numeros = new int[valores.length];

        int contador = 0;

        scanner.close();

        for (String numero : valores) {
            numeros[contador] = Integer.parseInt(numero);
            contador++;
        }

        System.out.println("O maior número é: " + Arrays.stream(numeros).max().getAsInt());

        System.out.println("A soma dos valores é: " + Arrays.stream(numeros).sum());
    }
}