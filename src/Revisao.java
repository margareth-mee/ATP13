/*
_ Construa um método que imprima uma mensagem para ser usada como cabeçalho da aplicação. 
A mensagem deve exibir a mensagem “Cálculo de média”.
_ Construa um método que receba dois parâmetros inteiros realize a soma dos dois valores armaze
 em uma variável e retorne o valor da variável ao final da execução.
_ Construa um método que receba quatro parâmetros inteiros e realize o cálculo da média entre eles,
armaze em uma variável double e retorne o valor da média ao final da execução.

_ No método main, realize a chamada do método que imprime a mensagem do cabeçalho.
_ No método main, realize a chamada do método soma por quatro vezes, passando valores 
diferentes a cada nova chamada,  armazene o retorno de cada chamada em uma variável diferente.
_ No método main, realize a chamada do método do cálculo da média, envie como argumento os quatro 
valores armazenados durante as chamadas do método de soma, armazene o retorno do cálculo da média 
em uma nova variável.
_ Ao final da execução do método main, exiba uma mensagem informando qual o valor da média calculada.
*/

public class Revisao{
    public static void main(String[] args) {
        cabecalho();
        int soma1 = soma(3,7); 
        System.out.printf("A soma é %d\n", soma1);
        double media1 = media(3, 7, 8, 1); 
        System.out.printf("A média é %.2f\n", media1);
        
    }

    static void cabecalho(){
        System.out.println("--------------  Cálculo de média -----------");
    } 

    static int soma(int num1, int num2){
        int soma = num1 + num2;
        return soma;
    } 

    static double media(int num1, int num2, int num3, int num4){
        double media = (num1 + num2 + num3 + num4)/4.0;
        return media;
    } 
}