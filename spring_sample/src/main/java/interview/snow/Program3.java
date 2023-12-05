package interview.snow;

public class Program3 {
    public static void main(String[] args) {
        Program3 p =  new Program3();
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,6,7,8};
        //1,2,3,4,4,5,6,7,8
        p.solve(arr1, arr2);
    }

    private void solve(int[] arr1, int[] arr2) {
        int m = arr1.length, n =arr2.length, k=0;
        int[] res = new int[9];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr1[i]<=arr2[j]){
                    res[k] = arr1[i];
                    k++;
                    break;
                }
                else{
                    res[k] = arr2[j];
                    k++;
                }
            }
        }
        for(int x = 0; x<res.length; x++){
            System.out.print(res[x]+",");
        }

    }


}
