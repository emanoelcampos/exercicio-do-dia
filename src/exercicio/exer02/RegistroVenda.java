package exercicio.exer02;

public class RegistroVenda {

    public static double valorVenda(double valor){
        if(valor < 30){
            return valor + (0.45 * valor);
        }
        return valor + (0.3 * valor);
    }

    public static void main(String[] args) {
        System.out.println(valorVenda(29.99));
        System.out.println(valorVenda(35));
    }
}
