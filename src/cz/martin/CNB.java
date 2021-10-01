package cz.martin;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CNB {
    public static void main(String[] args) {
        String kurzy = "Austrálie|dolar|1|AUD|15,841\n" +
                "Brazílie|real|1|BRL|4,072\n" +
                "Bulharsko|lev|1|BGN|13,035\n" +
                "Čína|žen-min-pi|1|CNY|3,407\n" +
                "Dánsko|koruna|1|DKK|3,429\n" +
                "EMU|euro|1|EUR|25,495\n" +
                "Filipíny|peso|100|PHP|43,168\n" +
                "Hongkong|dolar|1|HKD|2,827\n" +
                "Chorvatsko|kuna|1|HRK|3,406\n" +
                "Indie|rupie|100|INR|29,643\n" +
                "Indonesie|rupie|1000|IDR|1,539\n" +
                "Island|koruna|100|ISK|16,895\n" +
                "Izrael|nový šekel|1|ILS|6,823\n" +
                "Japonsko|jen|100|JPY|19,663\n" +
                "Jižní Afrika|rand|1|ZAR|1,452\n" +
                "Kanada|dolar|1|CAD|17,288\n" +
                "Korejská republika|won|100|KRW|1,859\n" +
                "Maďarsko|forint|100|HUF|7,076\n" +
                "Malajsie|ringgit|1|MYR|5,260\n" +
                "Mexiko|peso|1|MXN|1,074\n" +
                "MMF|ZPČ|1|XDR|31,126\n" +
                "Norsko|koruna|1|NOK|2,509\n" +
                "Nový Zéland|dolar|1|NZD|15,126\n" +
                "Polsko|zlotý|1|PLN|5,518\n" +
                "Rumunsko|leu|1|RON|5,152\n" +
                "Rusko|rubl|100|RUB|30,230\n" +
                "Singapur|dolar|1|SGD|16,179\n" +
                "Švédsko|koruna|1|SEK|2,507\n" +
                "Švýcarsko|frank|1|CHF|23,538\n" +
                "Thajsko|baht|100|THB|64,980\n" +
                "Turecko|lira|1|TRY|2,476\n" +
                "USA|dolar|1|USD|22,020\n" +
                "Velká Británie|libra|1|GBP|29,627\n" +
                "CR|koruna|1|CZK|1";

        String[] kurzyArray = kurzy.split("\n");
        HashMap<String, Float> k = new HashMap<>();
        for (String s : kurzyArray) {
            String[] str = s.split("\\|");
            k.put(str[3], Float.parseFloat(str[4]));
        }
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String[] input = sc.nextLine().split(" ");
            int pocet = Integer.parseInt(input[0]);
            String mena = input[1];
            String mena1 = input[3];
        }
    }
}
