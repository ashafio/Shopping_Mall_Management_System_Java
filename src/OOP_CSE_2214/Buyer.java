package OOP_CSE_2214;
import java.util.Scanner;

public class Buyer {

    public  void Buyer(){

        System.out.println(" We select you as  a buyer. ");
        System.out.println("Choose an option: ");
        System.out.println(" 1. Maps        2. Your Thoughts        3. About Ourself");
        System.out.println("            4. Search Product       5. Search Shop");
        System.out.println("                         6. All Shop List");
        System.out.println("Select an option:  ");

        //while(optionSelect){
        // problem
        Scanner input = new Scanner(System.in);
        int optionSelect = input.nextInt();

        switch (optionSelect)
        {

            case 1 :
                System.out.println("_____________________________________________________");
                System.out.println( "/////////////////////////////////////////////////////");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||    1      ||    2      ||    3      ||       4   ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println( "/////////////////////////////////////////////////////");
                System.out.println( "'''''''''''''''''''''''''''''''''''''''''''''''''''");
                System.out.println("_____________________________________________________");
                System.out.println( "/////////////////////////////////////////////////////");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||    5      ||    6      ||    7      ||       8   ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println("||           ||           ||           ||           ||");
                System.out.println( "/////////////////////////////////////////////////////");
                System.out.println( "'''''''''''''''''''''''''''''''''''''''''''''''''''");
                System.out.println("-----------------------------------------------------");

                Buyer();
                break;
            case 2 :
                System.out.println("Please write some word about your experience with us");
                System.out.println("Please write your comment here:  ");
                //Scanner input = new Scanner(System.in);
                String comment = input.nextLine();
                System.out.println(comment);
                break;
            case 3 :
                System.out.println("This is a console based project.");
                System.out.println("Using Object Oriented Programming language.");
                System.out.println("This project contributed by 3 person.");
                System.out.println("");
                break;
            case 4 :
                System.out.println("Here you can search all our products");

                break;
            case 5 :
                System.out.println("Here you can search all our Shop.");
                break;
            case 6 :
                System.out.println("Here you can see all our shop.");
                break;
            default:
                Buyer();
                break;

        }

    }
}


