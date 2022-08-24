package exercicio.exer05;

import java.util.HashSet;
import java.util.Set;

public class novoConjunto {

    public static void conjuntoUnico(int[] conjunto1, int[] conjunto2){
        Set<Integer> conjuntoUnico = new HashSet<>();
        for(int numero : conjunto1){
            conjuntoUnico.add(numero);
        }
        for(int numero : conjunto2){
            conjuntoUnico.add(numero);
        }
        System.out.println(conjuntoUnico);
    }

    public static void main(String[] args) {
        conjuntoUnico(new int[]{9,2,5,6,1,3} ,new int[]{2,7,9,8,4,10});
    }
}
