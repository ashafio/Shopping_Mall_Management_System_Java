package OOP_CSE_2214;

import java.util.Scanner;

public class Main {

    public Scanner input =new Scanner(System.in);

    public void Design()
    {
        System.out.println(" |=================================================================|");
        System.out.println(" |.................................................................|");
        System.out.println(" |........================================================.........|");
        System.out.println(" |.......|                                                |........|");
        System.out.println(" |.......|   >>  Shopping Mall Management Project   <<    |........|");
        System.out.println(" |.......|                                                |........|");
        System.out.println(" |........================================================.........|");
        System.out.println(" |.................................................................|");
        System.out.println(" |=================================================================|");
        System.out.println("");

        System.out.println(" .........Welcome to the Shopping Mall Management Project...........");
    }

    public static void main(String[] args) {
        Main ob = new Main();
        ob.Design();
        Login log = new Login();
        log.login();
//        Buyer buy = new Buyer();
//        buy.Buyer();
        Seller sell = new Seller();
        sell.Seller();
        Admin ad = new Admin();
        ad.Admin();
    }

}
