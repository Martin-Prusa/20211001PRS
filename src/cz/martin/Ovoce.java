package cz.martin;

import java.util.HashSet;
import java.util.Scanner;

public class Ovoce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> ovoce = new HashSet<>();
        HashSet<String> zelenina = new HashSet<>();
        System.out.println("Zadej pocet ovoce: ");
        int ovoceCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < ovoceCount; i++) {
            String s = sc.nextLine().toLowerCase();
            if(ovoce.contains(s)) System.out.println("Jiz zadano");
            else ovoce.add(s);
        }

        System.out.println("Zadej pocet zeleniny");
        int zeleninaCount = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < zeleninaCount; i++) {
            String s = sc.nextLine().toLowerCase();
            if(ovoce.contains(s) || zelenina.contains(s)) System.out.println("Jiz zadano");
            else zelenina.add(s);
        }


        String s = sc.nextLine();
        while(!s.equalsIgnoreCase("end")) {
            if(ovoce.contains(s)) System.out.println("Ovoce");
            else if(zelenina.contains(s)) System.out.println("Zelenina");
            else System.out.println("Neznámé");
            s = sc.nextLine();
        }
    }
}
