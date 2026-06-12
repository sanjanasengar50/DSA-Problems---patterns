import java.util.Scanner;
class HalfD{
    static void pypart(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < num-1; i++){
            for(int j = i; j < num-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class HalfDiamond{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            HalfD d = new HalfD();
            System.out.print("Enter a number of row: ");
            int n = sc.nextInt();
            d.pypart(n);
    }
}