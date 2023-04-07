package questão2;

import java.util.Scanner;
class Fibonacci {

    static int fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite algum numero até 100, e veja se ele faz parte da sequancia de Fibonacci");
        int numeroDigitaado = sc.nextInt();

        System.out.println("seu número digitado foi: " + numeroDigitaado);

        // teste do programa. Imprime os 30 primeiros termos
        int[] numerosFibo = new int[12];
        for (int i = 0; i < 12; i++) {
           // System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
            numerosFibo[i] =  Fibonacci.fibo(i);
        }

        boolean pertenceFibo = false;

        for (int i : numerosFibo){
            if (numeroDigitaado == i) {
                pertenceFibo = true;
                break;
            }
        }

        if(pertenceFibo) {
            System.out.println("Este número está na sequancia de Fibo");
        }else{
            System.out.println("Este número não faz parte da sequência de Fibo");
        }

    }

}
