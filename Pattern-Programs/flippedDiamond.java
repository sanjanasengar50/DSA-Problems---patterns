import java.util.Scanner;
class FlipHalfD{
    static void pypart(int num){
        for(int i = 0; i < num; i++){
            for(int j = num-1; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < num-1; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = num-i-1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class flippedDiamond{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            FlipHalfD d = new FlipHalfD();
            System.out.print("Enter a number of row: ");
            int n = sc.nextInt();
            d.pypart(n);
    }
}