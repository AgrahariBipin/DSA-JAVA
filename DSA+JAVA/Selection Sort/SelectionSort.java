// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.*;
import java.io.*;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,8,-5,78,5};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=great(arr,0,last);
            swap(arr,max,last);
        }
    }
    
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
    static int great(int[] arr,int a,int b){
        int m=0;
        for (int i=a;i<=b ;i++ ){
            if(arr[i]>m){
                m=i;
            }
        }
        return m;
    }
}