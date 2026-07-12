import java.util.Scanner;
class LeftPyramid{
    static void pypart(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
class NumberPyramid{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            LeftPyramid l = new LeftPyramid();
            System.out.print("Enter a number of row: ");
            int n = sc.nextInt();
            l.pypart(n);
    }
}