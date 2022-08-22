package exercicio.exer04;

public class Algoritmo {

    public static void main(String[] args) {

        int A = 7;
        int B = 3;

        //Algoritmo XOR Swap
        A = A + B; // A = 7 + 3;
        B = A - B; // B = 10 - 3; (B = 7)
        A = A - B; // A = 10 - 7; (A = 3)

        System.out.println(A);
        System.out.println(B);
    }
}
