import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        cabecalho();
        imprimeMenu();

        byte opcao = escolheOpcao("Escolha uma opção: ");

        double n1 = lerNumero("\nDigite o primeiro número: ");
        double n2 = lerNumero("Digite o segundo número: ");

        realizaOpcao(opcao, n1, n2);
    }

    static void cabecalho() {
        System.out.println("****** CALCULADORA ******");
    }

    static void imprimeMenu() {
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
    }

    static byte escolheOpcao(String mensagem) {
        Scanner entrada = new Scanner(System.in);
        byte opcao = 0;

        do {
            System.out.print(mensagem);
            opcao = Byte.parseByte(entrada.nextLine());
        } while (!validaOpcao(opcao));

        return opcao;
    }

    static boolean validaOpcao(byte opcao) {
        boolean ehValido = true;

        if (opcao <= 0 || opcao > 4) {
            System.out.println("\nOpção inválida, tente novamente!\n");
            ehValido = false;
        }

        return ehValido;
    }

    static void realizaOpcao(byte opcao, double n1, double n2) {

        switch (opcao) {
            case 1:
                System.out.printf("\nResultado da soma: %.1f\n", soma(n1, n2));
                break;
            case 2:
                System.out.printf("\nResultado da subtração: %.1f\n", subtracao(n1, n2));
                break;
            case 3:
                System.out.printf("\nResultado da multiplicação: %.1f\n", multiplicacao(n1, n2));
                break;
            case 4:
                System.out.printf("\nResultado da divisão: %.1f\n", divisao(n1, n2));
                break;
        }

    }

    static double lerNumero(String mensagem) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensagem);
        double numero = Double.parseDouble(sc.nextLine());
        return numero;
    }

    static boolean validaNumero(byte opcao, int n2) {
        boolean ehValido = true;

        if (opcao == 4 && n2 == 0.0) {
            System.out.println("\nO divisor não pode ser igual a 0");
            ehValido = false;
        }

        return ehValido;
    }

    static double soma(double n1, double n2) {
        return n1 + n2;
    }

    static double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    static double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }

    static double divisao(double n1, double n2) {
        return n1 / n2;
    }
}
