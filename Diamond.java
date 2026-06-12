import java.util.Scanner;

class Dmd {
    static void pypart(int num) {

        // Upper half
        for(int i = 0; i < num; i++) {

            for(int j = 0; j < num-i-1; j++)
                System.out.print(" ");

            for(int j = 0; j < 2*i+1; j++)
                System.out.print("*");

            System.out.println();
        }

        // Lower half
        for(int i = 1; i < num; i++) {

            for(int j = 0; j < i; j++)
                System.out.print(" ");

            for(int j = 0; j < 2*(num-i)-1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}

class Diamond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        Dmd.pypart(n); // Correct static call
    }
}