package exercicio.exer06;

public class SomaImpar {

    public static void somaNumeroImpar(int numeroMenor, int numeroMaior){
        int soma = 0;
        for (int n = numeroMenor + 1; n < numeroMaior; n++){
            if(n % 2 != 0){
                soma+=n;
            }
            System.out.println(n);
        }
        System.out.println(soma);
    }

    public static void main(String[] args) {
        somaNumeroImpar(3,11);
    }
}
