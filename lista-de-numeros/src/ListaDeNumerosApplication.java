import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaDeNumerosApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma sequência de 10 números inteiros: ");

        int[] numeros = new int[10];

        try {
            for (int i = 0; i < 10; i++) {
                numeros[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("Digite apenas números inteiros");
        }

        System.out.println("O maior número é o: " + Arrays.stream(numeros).max().getAsInt());
        System.out.println("O menor número é o: " + Arrays.stream(numeros).min().getAsInt());
        System.out.println("A média dos números é: " + Arrays.stream(numeros).average().getAsDouble());


    }
}
