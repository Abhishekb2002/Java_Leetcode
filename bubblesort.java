import java.util.*;

public class bubblesort{
    public static void sort(int arr[]){
        int swap=0;
        for(int turn=0; turn<arr.length; turn++){
            
            for(int j=0; j<arr.length-turn-1; j++){
                if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }
        System.out.println("how many time loop run : "+swap);  
    }
            public static void printarr(int arr[]){
                for(int i=0; i<arr.length; i++){
                   System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
    public static void main(String args[])
    {
        int arr[]={4,6,1,2,3,5};

        sort(arr);
        printarr(arr);
    }
}