package practise;/*
    Created By: Talveen Rakhra
    Created On: 21-06-2021
    Question URL:
    Time Taken:
    Complexity:
*/

/*
interface BaseI{
    void method();
}
class BaseC{
    public void method(){
        System.out.println("BaseC");
    }
}
*/

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for(int i=0;i<q;i++){
            int a = scanner.nextInt();
            int b =scanner.nextInt();
            int n = scanner.nextInt();
            int k=0;
            while(k<n){
                int sum=0;
                for(int j=0; j<=k;j++){
                    sum=sum+(int)Math.pow(2,j)*b;
                }
                System.out.print(a+sum + " ");
                k++;
            }

        }
    }
}
