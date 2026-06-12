import java.util.Scanner;
class LeftPyramid{
    static void pypart(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class SimplePyramid{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            LeftPyramid l = new LeftPyramid();
            System.out.print("Enter a number of row: ");
            int n = sc.nextInt();
            l.pypart(n);
    }
}