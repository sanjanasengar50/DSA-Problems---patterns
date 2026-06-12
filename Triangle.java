import java.util.Scanner;
class Tpattern{
    static void pypart(int num){
        for(int i = 0; i < num; i++){
            for(int j = num; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
class Triangle{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            Tpattern l = new Tpattern();
            System.out.print("Enter a number of row: ");
            int n = sc.nextInt();
            l.pypart(n);
    }
}