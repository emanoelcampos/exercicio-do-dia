package exercicio.exer07;

public class Tabuada {
    public static void calculaTabuada(int numero){
        for(int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(resultado);
        }
    }

    public static void main(String[] args) {
        calculaTabuada(1);
    }
}
