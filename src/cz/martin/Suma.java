package cz.martin;

import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while(sc.hasNext()) {
            suma += sc.nextInt();
        }
        System.out.println(suma);
    }
}
