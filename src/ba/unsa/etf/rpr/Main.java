package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);
        int n = 0;
        System.out.println("Unesite broj n");
        n = ulaz.nextInt();

        for(int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i);
        }
    }
    public static int sumaCifara(int n) {
        int suma = 0;

        n = Math.abs(n);
        while (n != 0) {
            suma = suma + (n % 10);
            n = n / 10;
        }
        return suma;
    }
}
