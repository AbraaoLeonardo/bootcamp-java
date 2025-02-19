import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int number1 = terminal.nextInt();
        System.out.println("Digite o segundo parametro");
        int number2 = terminal.nextInt();
        terminal.close();

        try {
            contar(number1, number2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int number1, int number2) throws ParametrosInvalidosException {
        if (number2 <= number1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        } else {
            int contagem = number2 - number1;
            for (int index = 1; index < contagem; index++) {
                System.out.println("Imprimindo o número " + (index));
            }
        }
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }
}
