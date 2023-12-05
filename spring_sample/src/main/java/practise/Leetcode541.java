package practise;

public class Leetcode541 {
    public static void main(String[] args) {
        Leetcode541 l = new Leetcode541();
        String s = "abcdefg"; int k=2;
        l.solve(s,k);
    }

    private void solve(String s, int k) {
        int n = s.length();
        char[] str = s.toCharArray();
        for(int i = 0; i<n; i+=2*k){
           if(i+k-1 <= n-1){
               reverse(i, i+k-1, str);
           }
           else{
               reverse(i, n-1, str);
           }
        }
        String ans = new String(str);
        System.out.println(ans);
    }
    public void reverse(int i, int j, char[] str){
        while(i < j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}
