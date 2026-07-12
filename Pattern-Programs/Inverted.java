import java.util.Scanner;
class LfInverted{
    static void pypart(int num){
        for(int i = 0; i < num; i++){
            for(int j = num; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class Inverted{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LfInverted l = new  LfInverted();
        System.out.print("Enter a number of row: ");
        int n = sc.nextInt();
        l.pypart(n);
    }
}