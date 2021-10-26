package OOP_CSE_2214;
import java.util.Scanner;


public class SellerAfterLogin {
    public Scanner input = new Scanner(System.in);
    ProductsAvailable product = new ProductsAvailable();
    AddProducts addGoods = new AddProducts();
    SalesInsights insights = new SalesInsights();

    public void SellerHome()
    {
        //System.out.println("Welcome Back"+SellerName());
        System.out.println("Welcome Back!!!");
        System.out.println("Enter 1 to see the available products.");
        System.out.println("Enter 2 to Add more Products.");
        System.out.println("Enter 3 to see your sales insights.");

        int ShopWatch = input.nextLine().charAt(0);

        if(ShopWatch == '1')
        {
            product.ProductsAvailable();
        }
        else if (ShopWatch == '2')
        {
            addGoods.AddProduct();
        }
        else if(ShopWatch == '3')
        {
            insights.SalesInsights();
        }
        else
        {
            System.out.println("Something Went Wrong.\n Wrong Input. :(");
        }


    }
}
