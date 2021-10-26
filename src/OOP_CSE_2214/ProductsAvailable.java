package OOP_CSE_2214;
//
public class ProductsAvailable extends Login {
    public void ProductAvailable() {
        Seller1Goods();
    }


    ////        sellerFunction();
////        Seller1Login();
////        Seller2Login();
////        Seller3Login();
//
//        //-------------------------------------------------------------
//
//
//
//        //Seller1Login
//
//        public void Seller1Login()
//        {
//            // int Seller1ID = input.nextLine().charAt(0);
//            System.out.println("Enter Your Password: ");
//            String Seller1Pass = input.nextLine();
//
//            //if(Seller1ID == 201 && Seller1Pass == "IMNewSeller01")
//            if(Seller1Pass == "IMNewSeller01")
//            {
//                Seller1Goods();
//            }
//            else
//            {
//                System.out.println("Error.Wrong ID or Password :(");
//                System.out.println("Forget Password? ");
//                System.out.println("Please, contact our admin to reset your password.");
//
//            }
//
//        }
//
//
//        ///Seller 02 Function
//        public void Seller2Login(){
//
//            // int Seller2ID = input.nextLine().charAt(0);
//            System.out.println("Enter Your Password: ");
//            String Seller2Pass = input.nextLine();
//
//            //if(Seller2ID == 202 && Seller1Pass == "IMNewSeller02")
//            if(Seller2Pass == "IMNewSeller02")
//            {
//                Seller2Goods();
//            }
//            else
//            {
//                System.out.println("Error.Wrong ID or Password :(");
//                System.out.println("Forget Password? ");
//                System.out.println("Please, contact our admin to reset your password.");
//
//            }
//
//        }
//
//        ///Seller 3 function
//        public void Seller3Login(){
//
//            // int Seller3ID = input.nextLine().charAt(0);
//            System.out.println("Enter Your Password: ");
//            String Seller3Pass = input.nextLine();
//
//            //if(Seller3ID == 203 && Seller3Pass == "IMNewSeller03")
//            if(Seller3Pass == "IMNewSeller03")
//            {
//                Seller3Goods();
//            }
//            else
//            {
//                System.out.println("Error.Wrong ID or Password :(");
//                System.out.println("Forget Password? ");
//                System.out.println("Please, contact our admin to reset your password.");
//
//            }
//
//        }
//
//
//
//        //---------------------------------------------------------------
//        //SellTest
//
//
//
//
//
//        public void sellerFunction()
//        {
//            System.out.println("Enter Your Seller ID: ");
//            int SellerID = input.nextLine().charAt(0);
//
//            switch (SellerID)
//            {
//                case 1:
//                    if(SellerID == 201)
//                        Seller1Login();
//                    break;
//
//                case 2:
//                    if(SellerID == 202)
//                        Seller2Login();
//                    break;
//
//                case 3:
//                    if(SellerID == 203)
//                        Seller3Login();
//                    break;
//            }
//
//
//
//
//
//
//
//
//        }
//}
//
//    //Seller1Goods
//
    public void Seller1Goods() {
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|               GadgetLovers Shop                  |");
        System.out.println("\t\t|      Product Name       ||      Product Code     |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    GoPro Hero 7 Black   ||          GoH7         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    GoPro Hero 8 Black   ||          GoH8         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    GoPro Hero 9 Black   ||          GoH9         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    HP Pavilion Laptop   ||          HPPL         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|      HP Envy Laptop     ||          HPEL         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    HP Spectre Laptop    ||          HPSL         |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t|    HP Probook Laptop    ||          HPProL       |");
        System.out.println("\t\t----------------------------------------------------");
        System.out.println("\t\t----------------------------------------------------");

    }
}
//
//    public void Seller2Goods(){
//
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|               GadgetLovers Shop                  |");
//        System.out.println("\t\t|      Product Name       ||      Product Code     |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    GoPro Hero 7 Black   ||          GoH7         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    GoPro Hero 8 Black   ||          GoH8         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    GoPro Hero 9 Black   ||          GoH9         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    HP Pavilion Laptop   ||          HPPL         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|      HP Envy Laptop     ||          HPEL         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    HP Spectre Laptop    ||          HPSL         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    HP Probook Laptop    ||          HPProL       |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t----------------------------------------------------");
//
//    }
//
//    public void Seller3Goods(){
//
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|               GadgetLovers Shop                  |");
//        System.out.println("\t\t|      Product Name       ||      Product Code     |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    GoPro Hero 7 Black   ||          GoH7         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    GoPro Hero 8 Black   ||          GoH8         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    GoPro Hero 9 Black   ||          GoH9         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    HP Pavilion Laptop   ||          HPPL         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|      HP Envy Laptop     ||          HPEL         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    HP Spectre Laptop    ||          HPSL         |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t|    HP Probook Laptop    ||          HPProL       |");
//        System.out.println("\t\t----------------------------------------------------");
//        System.out.println("\t\t----------------------------------------------------");
//
//    }
//
