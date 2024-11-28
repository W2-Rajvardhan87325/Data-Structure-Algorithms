package BasicCodes;

import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the length  :: ");
        int length =sc.nextInt();

        System.out.print("Enter the breadth :: ");
        int  breadth=sc.nextInt();

        System.out.println((length == breadth) ? "It is a Square" : "It is not a Square");

        sc.close();
    }
}
