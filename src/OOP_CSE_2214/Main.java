package OOP_CSE_2214;

//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here }
//}
//package shoppingmall;
import java.util.Scanner;

public class Main {

    public Scanner input =new Scanner(System.in);
    //public Scanner input = new Scanner(System.in);
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
    }
}
