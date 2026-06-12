import java.util.Scanner;
class InvertedT{
    static void pypart(int num){
        for(int i = 0; i < num; i++){
             for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j = num; j > i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class InvertedTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        InvertedT t = new  InvertedT();
        System.out.print("Enter a number of row: ");
        int n = sc.nextInt();
        t.pypart(n);
    }
}