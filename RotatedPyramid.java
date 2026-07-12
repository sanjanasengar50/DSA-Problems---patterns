import java.util.Scanner;
class RightPyramid{
    static void pypart(int num){
       
        int n=1;
        for(int i = 0; i < num; i++){
            for(int j = num; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                
                System.out.print(n+k);
                

            }
            if (i == 0) {
                  n++;
            } 
            else {
                  n += i;
            }  
              
            System.out.println();
            
        }
    }
}
class RotatedPyramid{
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            RightPyramid l = new RightPyramid();
            System.out.print("Enter a number of row: ");
            int n = sc.nextInt();
            l.pypart(n);
    }
}