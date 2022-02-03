import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CargosApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o nome da da: " + i + "ª pessoa: ");
            String nome = scanner.next();

            System.out.print("Informe o cargo da: " + i + "ª pessoa (Starter, Júnior, Sênior): ");
            String cargo = scanner.next();

            switch (cargo) {
                case "Starter":
                    cargo = "Starter";
                    break;
                case "Júnior":
                    cargo = "Júnior";
                    break;
                default:
                    cargo = "Sênior";
            }
            Pessoa pessoa = new Pessoa(nome, cargo);
            pessoas.add(pessoa);
        }

        Map<String, Long> counts = pessoas.stream().collect(Collectors.groupingBy(e -> e.getCargo(), Collectors.counting()));

        System.out.println(counts);
    }
}