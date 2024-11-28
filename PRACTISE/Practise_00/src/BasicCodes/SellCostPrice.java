package BasicCodes;

import java.util.Scanner;

public class SellCostPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Selling Price :: ");
        int sellPrice=sc.nextInt();

        System.out.print("Enter the Cost Price    :: ");
        int costPrice=sc.nextInt();

        if (sellPrice>costPrice){
            System.out.println("You made a profit of Rps :: "+(sellPrice-costPrice));
        }
        if (costPrice>sellPrice){
            System.out.println("You incurred loss of Rps :: "+(costPrice-sellPrice));
        }

        sc.close();
    }
}
