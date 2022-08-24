package exercicio.exer01;

import java.util.HashMap;
import java.util.Map;

public class Funcao {

    public static void contaRepedido(int[] numeros){
        Map<Integer, Integer> contador = new HashMap<>();
        for(int repetido : numeros){
            if(!contador.containsKey(repetido))
                contador.put(repetido, 0);
            contador.put(repetido, contador.get(repetido) +1);
        }
        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if(entry.getValue() > 1)
                System.out.printf("\nNúmero %s : %d vezes", entry.getKey(), entry.getValue());
        }
    }

    public static void main(String[] args) {
        Funcao.contaRepedido(new int[] {1, 7, 9, 7, 4, 3, 9, 4, 3, 7});
    }
}
