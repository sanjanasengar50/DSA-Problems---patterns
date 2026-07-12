import java.util.Scanner;
class Pyramid{
    static void pypart(int num){
        int c = 1;
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(c +" ");
                c++;                
            }
            System.out.println();
            
        }
    }
}
class Number1{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            Pyramid l = new Pyramid();
            System.out.print("Enter a number of row: ");
            int n = sc.nextInt();
            l.pypart(n);
    }
}