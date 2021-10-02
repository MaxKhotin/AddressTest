package Address;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set index:");
        int indx = sc.nextInt();
        System.out.println("Set country:");
        String cnt = sc.next();
        System.out.println("Set city:");
        String cty = sc.next();
        System.out.println("Set street:");
        String str = sc.next();
        System.out.println("Set house:");
        int hs = sc.nextInt();
        System.out.println("Set apartment");
        int ap = sc.nextInt();

        Address ad1 = new Address();
        ad1.setIndex(indx);
        ad1.setCountry(cnt);
        ad1.setCity(cty);
        ad1.setStreet(str);
        ad1.setHouse(hs);
        ad1.setApartment(ap);
        ad1.getInfo();
    }
}
