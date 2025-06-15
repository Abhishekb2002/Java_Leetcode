import java.util.*;
import java.util.Scanner;

class subarray{
    public void print(int arr[],int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){  
                if(arr[i]+arr[j]==target){
                    System.out.println("("+arr[i]+","+arr[j]+","+")");
               }
            }}}}
class Subarraysumtarget{
     public static void main(String args[]){
        int arr[]={3,4,-7,1,3,3,1,-4};
        int target=7;
        subarray sobj= new subarray();
        
        sobj.print(arr,target);

        // output:
        // (3,4)
        // (3,4,-7,1,3,3)
        // (1,3,3)
        // (3,3,1)

    }
}