package cricket_Tournament;
import java.util.Scanner;
public class t_Shirts
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] purchase_cart = new int[3];
    int[] prices = {200, 250, 300};
    String[] types = {"roundneck", "collared", "hooded"};

    
    for (int i = 0; i < 3; i++)
    {
      System.out.print("Enter the no. of " + types[i] + " Tshirts: ");
      purchase_cart[i] = sc.nextInt();
    }

    
    int totCost = 0;
    for (int i = 0; i < 3; i++)
    {
      totCost = totCost + ( prices[i] * purchase_cart[i]);
    }

    
    int totOrdered = 0;
    for (int i = 0; i < 3; i++) 
    {
      totOrdered = totOrdered +purchase_cart[i];
    }

   
    int discount = 0;
    if (totOrdered < 5)
    {
      discount = 0;
    } 
    else if (totOrdered >= 5 && totOrdered <= 10) 
    {
      discount = 10;
    }
    else 
    {
      discount = 20;
    }

    int finalAmount = (totCost - (totCost * (discount / 100)));

    
    System.out.println(" Amou after disc is:rs." + finalAmount);
  }
}




