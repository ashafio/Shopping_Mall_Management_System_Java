package OOP_CSE_2214;
import java.util.Scanner;

public class Login{
    public Scanner input = new Scanner(System.in);

    public void login()
    {
        System.out.println("Log in as:  ");
        System.out.println("            1. Buyer");
        System.out.println("            2. Seller");
        System.out.println("            3. Admin");
        System.out.println("Chose an option: 1/2/3");

        int loginOption = input.nextInt();
        switch (loginOption){
            case 1:
                buyerFunction();
                break;
            case 2:
                sellerFunction();
                break;
            case 3:
                adminFunction();
            default:
                break;

        }
    }
}
}
