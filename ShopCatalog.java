/** Janice Martyres
 * Assignment #1: Java Class
 * Shopping Catalog
 * Date Due: Feb. 15
 * LTU HONOR CODE:
 * 
 * "I have neither given nor received unauthorized aid in completing this work, nor have I presented someone else's work as my own."
 */
package shopcatalog;
import java.util.*;

/**
 *
 * @author jmartyres
 */
public class ShopCatalog {

    private static final String[] products = new String [4];
    private static float total=0.0f;
    private static final float tax = 0.06f; // 6 percent of tax to final price
    private static final float[] firTotal = new float[4]; // firTotal is FIRST Total
    private static final float[] finTotal = new float[4]; // finTotal is FINAL Total
    private static final double[]pPrice = new double[4];
    private static String pCode;
    // static String products[] = new String[6];
   //  static int answer; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FIRST INTRO TO PRODUCTS
        products[0] = "Spicy Chicken Taquitos";
        products[1] = "Soy Milk Ice Cream Chocolate Chunk";
        products[2] = "Pad Thai to Go";
        products[3] = "Chocolate Covered Hawaiian Macadamian Nuts";
        pPrice[0] = (3.69);
        pPrice[1] = (4.99);
        pPrice[2] = (8.99);
        pPrice[3] = (6.99);
        int quantity = 0;
        int orderNum = 0;
     Scanner s = new Scanner(System.in);
     
        // TODO code application logic here
        // BEGIN CATALOG
        do{
        System.out.println("------------------");
        System.out.println("SHOP TILL YOU DROP ; The Catalog");
        System.out.println("------------------");
          
        // MENU for catalog done through strings
         System.out.println("********************************************");
         System.out.println("Spicy Chicken Taquitos!: $3.69 for a pack of 20 - Code [J123]");
         System.out.println("");
         System.out.println("-----Spicy Chicken Wrapped in A hard shell. Good for a nightime snack!");
         System.out.println("");
         System.out.println("Soy Milk Ice Cream Chocolate Chuck: $4.99 each - Code [J456]");
         System.out.println("");
         System.out.println("-----Healthy yet creamy ice cream filled with chocolate pieces. Yum!");
         System.out.println("");
         System.out.println("Pad Thai to Go! Dinner for TWO: $8.99 - Code [J789]");
         System.out.println("");
	 System.out.println("-----A Thai favorite. Noodles with peanuts and lemons. Quite spicy too!");
         System.out.println("");
         System.out.println("Chocolate Covered Hawaiian Macadamian Nuts: $6.99 for a box of 18 - Code [J101]");
         System.out.println("");
	 System.out.println("-----If you like sweet and salty this is for you!");
         System.out.println("********************************************");
    
         System.out.println("Now please enter the code of what you'd like to order. If you want to stop press 0");
         pCode = s.nextLine();
         
         if(pCode.equals("J123")){
             System.out.println("Spicy Chicken Taquitos! Yeah!");
             System.out.println("Please enter quantity: ");
             quantity = s.nextInt();
             finTotal[0] = (float) (pPrice[0]*quantity);
             System.out.println(quantity + " Taquitos = $" + finTotal[0]);
             
        }else if(pCode.equals("J456")){
            System.out.println("Soy Milk Ice Cream Chocolate Chunk");
            System.out.println("Quantity: ");
            quantity = s.nextInt();
            finTotal[1] = (float) (pPrice[1] * quantity);
            System.out.println(quantity + " Soy Milk Ice Cream Chocolate Chunk = $" + finTotal[1]);
        }else if(pCode.equals("J789")){
            System.out.println("Pad Thai to Go! Dinner for TWO");
            System.out.println("Quantity: ");
            quantity = s.nextInt();
            finTotal[2] = (float) (pPrice[2] * quantity);
            System.out.println(quantity + " Pad Thai to Go = $" + finTotal[2]);
        }else if(pCode.equals("J101")){
            System.out.println("Chocolate Covered Macadamian Nuts");
            System.out.println("Quantity: ");
            quantity = s.nextInt();
            finTotal[3] = (float) (pPrice[3] * quantity);
            System.out.println(quantity + " Chocolate Covered Macadamian Nuts = $" + finTotal[3]);
        }else if(pCode.equals("0")){
            System.out.printf("%.2f", totalBill()); // used printf to get a more format of decimal
            System.out.println("");
            break;
        } // statements will close
        orderNum++;
        quantity++;
          // close main function
    
}while(true); // closes the if and else loops

} 

public static float totalBill() {
    
    firTotal[0] = finTotal[0] * tax;
    firTotal[1] = finTotal[1] * tax;
    firTotal[2] = finTotal[2] * tax;
    firTotal[3] = finTotal[3] * tax;
    total = firTotal[0] + firTotal[1] + firTotal[2] + firTotal[3] + finTotal[0] + finTotal[1] + finTotal[2] + finTotal[3];
    return total;
} // the bill
} // the class