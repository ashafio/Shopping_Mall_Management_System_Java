package OOP_CSE_2214;
import java.util.Scanner;

public class Login{
    SellerAfterLogin sellerafterlogin = new SellerAfterLogin();

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
                //buyerFunction();
                break;
            case 2:
                //new Seller();
                sellerFunction();
                break;
            case 3:
                //adminFunction();
            default:
                break;

        }
    }

    //SellTest
    //-------------------------------------------------------------
    //Seller1Login

    public void Seller1Login()
    {
        // int Seller1ID = input.nextLine().charAt(0);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        String Seller1Pass = input.nextLine();

        //if(Seller1ID == 201 && Seller1Pass == "IMNewSeller01")

       if(Seller1Pass =="IMNewSeller01")

        {
            sellerafterlogin.SellerHome();
        }
        else
        {
            System.out.println("Error.Wrong ID or Password :(");
            System.out.println("Forget Password? ");
            System.out.println("Please, contact our admin to reset your password.");

        }

    }

//
//    ///Seller 02 Function
//    public void Seller2Login(){
//
//        // int Seller2ID = input.nextLine().charAt(0);
//        System.out.println("Enter Your Password: ");
//        String Seller2Pass = input.nextLine();
//
//        //if(Seller2ID == 202 && Seller1Pass == "IMNewSeller02")
//        if(Seller2Pass == "IMNewSeller02")
//        {
//            sellerafterlogin.SellerHome();
//        }
//        else
//        {
//            System.out.println("Error.Wrong ID or Password :(");
//            System.out.println("Forget Password? ");
//            System.out.println("Please, contact our admin to reset your password.");
//
//        }
//
//    }
//
//    ///Seller 3 function
//    public void Seller3Login(){
//
//        // int Seller3ID = input.nextLine().charAt(0);
//        System.out.println("Enter Your Password: ");
//        String Seller3Pass = input.nextLine();
//
//        //if(Seller3ID == 203 && Seller3Pass == "IMNewSeller03")
//        if(Seller3Pass == "IMNewSeller03")
//        {
//            sellerafterlogin.SellerHome();
//        }
//        else
//        {
//            System.out.println("Error.Wrong ID or Password :(");
//            System.out.println("Forget Password? ");
//            System.out.println("Please, contact our admin to reset your password.");
//
//        }
//
//    }
//


    //---------------------------------------------------------------
    //SellTest


    public void sellerFunction()
    {
        System.out.println("Enter Your Seller ID: ");
        //int SellerID = input.nextLine().charAt(0);
        int SellerID = input.nextInt();
        switch (SellerID)
        {
            case 1:
                if(SellerID == 201)
                    Seller1Login();
                break;

//            case 2:
//                if(SellerID == 202)
//                    Seller2Login();
//                break;
//
//            case 3:
//                if(SellerID == 203)
//                    Seller3Login();
//                break;
        }


        ///Seller 01 Login
//        public void Seller1Login()
//    {
//       // int Seller1ID = input.nextLine().charAt(0);
//        System.out.println("Enter Your Password: ");
//        String Seller1Pass = input.nextLine();
//
//        //if(Seller1ID == 201 && Seller1Pass == "IMNewSeller01")
//        if(Seller1Pass == "IMNewSeller01")
//        {
//            sellerafterlogin.SellerHome();
//        }
//        else
//        {
//            System.out.println("Error.Wrong ID or Password :(");
//            System.out.println("Forget Password? ");
//            System.out.println("Please, contact our admin to reset your password.");
//
//        }
//
//    }

///Seller 02 Function
//        public void Seller2Login(){
//
//        // int Seller2ID = input.nextLine().charAt(0);
//        System.out.println("Enter Your Password: ");
//        String Seller2Pass = input.nextLine();
//
//        //if(Seller2ID == 202 && Seller1Pass == "IMNewSeller02")
//        if(Seller2Pass == "IMNewSeller02")
//        {
//            sellerafterlogin.SellerHome();
//        }
//        else
//        {
//            System.out.println("Error.Wrong ID or Password :(");
//            System.out.println("Forget Password? ");
//            System.out.println("Please, contact our admin to reset your password.");
//
//        }
//
//    }
//
//        ///Seller 3 function
//        public void Seller3Login(){
//
//        // int Seller3ID = input.nextLine().charAt(0);
//        System.out.println("Enter Your Password: ");
//        String Seller3Pass = input.nextLine();
//
//        //if(Seller3ID == 203 && Seller3Pass == "IMNewSeller03")
//        if(Seller3Pass == "IMNewSeller03")
//        {
//            sellerafterlogin.SellerHome();
//        }
//        else
//        {
//            System.out.println("Error.Wrong ID or Password :(");
//            System.out.println("Forget Password? ");
//            System.out.println("Please, contact our admin to reset your password.");
//
//        }
//
//    }





    }


}

