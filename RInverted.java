import java.util.Scanner;
class RtInverted{
    static void pypart(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j = num; j > i ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class RInverted{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        RtInverted l = new  RtInverted();
        System.out.print("Enter a number of row: ");
        int n = sc.nextInt();
        l.pypart(n);
    }
}