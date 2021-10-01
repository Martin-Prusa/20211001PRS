package cz.martin;

import java.util.ArrayList;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(sc.hasNext()) {
            list.add(Integer.parseInt(sc.nextLine()));
        }

        int sum = 0;

        for (int i : list) {
            sum+=i;
        }

        System.out.println(sum);
    }
}
