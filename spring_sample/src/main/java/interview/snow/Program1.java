package interview.snow;

public class Program1 {
    public static void main(String[] args) {
        Program1 p = new Program1();
        int[] arr = {3,5,7,2,67,68,8,9,3,5};
        p.solve(arr);
    }

    private void solve(int[] arr) {
        int max=arr[0], secondMax = 0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>max){
                secondMax =max;
                max=arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
