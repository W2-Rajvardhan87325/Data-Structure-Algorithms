package PrintingPatterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows    :: ");
        int rows = sc.nextInt();

        for (int i=0;i<rows;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("============================");
        for (int i=0;i<rows;i++){
            for (int j=i;j<rows;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
