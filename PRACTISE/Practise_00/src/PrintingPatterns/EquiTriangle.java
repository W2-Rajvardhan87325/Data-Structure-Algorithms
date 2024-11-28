package PrintingPatterns;

import java.util.Scanner;

public class EquiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows    :: ");
        int rows = sc.nextInt();

        for (int i=0;i<rows;i++){

            for(int k=1;k<rows-i;k++){
                System.out.print("   ");
            }

            for (int j=0;j<(2*i+1);j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
