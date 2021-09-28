public class Calculadora {
    public static void main(String[] args) {
        cabecalho();
        menu();
    }

    static void cabecalho(){
        System.out.println("****** CALCULADORA ******");
    }

    static void menu(){
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
    }
}
