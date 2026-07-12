import java.util.Scanner;
class HL{
    static void shape(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 2*(n - i) -1 ; j >= 1 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i <= n-1; i++){
            for(int j = n-i-1; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i + 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
class Haurgless{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HL h = new HL();
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        h.shape(n);


    }
}