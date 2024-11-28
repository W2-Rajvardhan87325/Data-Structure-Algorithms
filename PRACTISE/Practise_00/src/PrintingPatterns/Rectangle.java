package PrintingPatterns;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows    :: ");
        int rows=sc.nextInt();

        System.out.println("Enter the number of columns :: ");
        int columns=sc.nextInt();

        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        sc.close();
    }
}
