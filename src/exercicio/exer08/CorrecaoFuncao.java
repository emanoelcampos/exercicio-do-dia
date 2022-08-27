package exercicio.exer08;

public class CorrecaoFuncao {
    public static void main(String[] args) {
        int var1 = 10, var2 = 20;

        int resultado = somar(var1, var2);

        if(resultado == 30) {
            System.out.println("Resultado dentro do esperado!");
       } else {
            System.out.println("Resultado fora do esperado!");
        }
    }

    private static int somar(int num1, int num2) {
        return num1 + num2;
    }

}
