package Kishorevel;
import java.util.*;

public class CyclicSort {
    public static void main(String[] args){
        int[] ar = {8, 5, 2, 1, 9, 4, 7, 3};
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void sort(int[] ar){
        int i=0;
        while(i<ar.length){
            int cur = ar[i]-1;
            if(ar[i]>0 && ar[i]<ar.length && ar[i]!=ar[cur]){
                swap(ar,i,cur);
            }else{
                i+=1;
            }
        }
    }
    static void swap(int[] ar, int a, int b){
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
//O/P : [1, 2, 3, 4, 5, 8, 7, 9]
