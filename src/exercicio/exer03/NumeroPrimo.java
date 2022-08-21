package exercicio.exer03;

public class NumeroPrimo {

    public static boolean numeroPrimo (int numero){
        for (int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(numeroPrimo(5));
    }
}
