package practise;/*
    Created By: Talveen Rakhra
    Created On: 01-12-2021
    Question Description: Find second smallest elements in an array
    Time Taken:
    Complexity:
*/

import java.util.Scanner;

public class Q1readmeQ {

    public static void main(String[] args) {
        Q1readmeQ q = new Q1readmeQ();
        int arr[] = {12,13,1,10,34,1};
        int len = 6;
        q.findSecondSmallest(arr,len);
        q.findSecondLargest(arr,len);
    }

    private void findSecondSmallest(int[] arr, int len) {
        int first=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
        if(len<2){
            System.out.println("Arr has only 1 integer");
        }
        for(int i=0; i <arr.length; i++){
            if(arr[i]<first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]<second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println(second);
    }

    private void findSecondLargest(int[] arr, int len) {
        int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        if(len<2){
            System.out.println("Arr has only 1 integer");
        }
        for(int i=0; i <arr.length; i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println(second);
    }


}
