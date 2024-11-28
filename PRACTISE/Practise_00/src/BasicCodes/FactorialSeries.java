package BasicCodes;

import java.util.Scanner;

public class FactorialSeries{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number to generate the series :: ");
        int number=sc.nextInt();
        int factorial=1;
        System.out.print("Series :: ");

        for (int i=1;i<=number;i++){
            factorial*=i;
            System.out.print(factorial+"\t");
        }
        sc.close();
    }
}
