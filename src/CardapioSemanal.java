import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class alimento {
    String nome;

    public alimento(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

class refeicao {
    alimento salada;
    alimento pratoPrincipal;
    alimento acompanhamento;

    public refeicao(alimento salada, alimento pratoPrincipal, alimento acompanhamento) {
        this.salada = salada;
        this.pratoPrincipal = pratoPrincipal;
        this.acompanhamento = acompanhamento;
    }

    @Override
    public String toString() {
        return "Salada: " + salada + ", Prato Principal: " + pratoPrincipal + ", Acompanhamento: " + acompanhamento;
    }
}

class diaTurnoRefeicao {
    String dia;
    String turno;
    refeicao refeicao;

    public diaTurnoRefeicao(String dia, String turno, refeicao refeicao) {
        this.dia = dia;
        this.turno = turno;
        this.refeicao = refeicao;
    }

    @Override
    public String toString() {
        return dia + " - " + turno + ": " + refeicao;
    }
}

public class CardapioSemanal {
    public static void main(String[] args) {
        List<alimento> alimentos = new ArrayList<>();
        List<diaTurnoRefeicao> cardapioSemanal = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Cadastro de alimentos
        System.out.println("Digite os nomes dos alimentos para cadastrar (um por linha). Para terminar, digite 'fim':");
        String input;
        while (!(input = scanner.nextLine()).equals("fim")) {
            alimentos.add(new alimento(input));
        }

        // Criação de refeições e cardápio semanal
        for (int i = 0; i < 7; i++) { // Para cada dia da semana
            System.out.println("Digite a refeição para o dia " + (i + 1) + ":");
            int indexSalada = solicitarIndexAlimento(scanner, alimentos, "Salada");
            int indexPratoPrincipal = solicitarIndexAlimento(scanner, alimentos, "Prato Principal");
            int indexAcompanhamento = solicitarIndexAlimento(scanner, alimentos, "Acompanhamento");

            refeicao refeicao = new refeicao(
                    alimentos.get(indexSalada),
                    alimentos.get(indexPratoPrincipal),
                    alimentos.get(indexAcompanhamento)
            );

            System.out.println("Digite o turno para o dia " + (i + 1) + " (manha, tarde, noite):");
            String turno = scanner.next();

            cardapioSemanal.add(new diaTurnoRefeicao(diasDaSemana[i], turno, refeicao));
        }

        // Exibição do cardápio semanal
        System.out.println("Cardápio Semanal:");
        for (diaTurnoRefeicao dtr : cardapioSemanal) {
            System.out.println(dtr);
        }

        scanner.close();
    }

    private static int solicitarIndexAlimento(Scanner scanner, List<alimento> alimentos, String tipoAlimento) {
        int index;
        do {
            System.out.println("Digite o índice do " + tipoAlimento + " (0 a " + (alimentos.size() - 1) + "):");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
            index = scanner.nextInt();
        } while (index < 0 || index >= alimentos.size());

        return index;
    }

    private static final String[] diasDaSemana = {
            "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"
    };
}

