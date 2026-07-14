class Solution{
    public static int getConcatenation(int arr[]){
        int n = arr.length;
        int arr1[] = new int[2*n]

        for(int i=0; i<n; i++){
            arr1[i] = arr[i];
            arr1[i+n] = arr[i];
        }
        return arr1;

    }
}
class ConcatinateArr{
    pblic static void main(String args[]){
        Solution s = new Solution();
        int arr[n] = new int[n];
        arr = [1,2,1];
        System.out.print(s.getConcatenation(arr));

    }
}