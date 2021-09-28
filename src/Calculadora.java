import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        cabecalho();
        menu();
        byte opcao = escolheOpcao("Escolha uma opção: ");
    }

    static void cabecalho() {
        System.out.println("****** CALCULADORA ******");
    }

    static void menu() {
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

    stransient
}
