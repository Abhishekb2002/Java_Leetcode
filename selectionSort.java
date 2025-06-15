public class selectionSort {

    public static void selectionsort(int arr[]) {
        for(int i=0; i<arr.length-1; i++){
            int impos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[impos]>arr[j]){
                    impos=j;
                }
            }
            int temp=arr[impos];
            arr[impos]=arr[i];
            arr[i]=temp;
        }
    }
        public static void display(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]+" ");
            }
        }
     public static void main(String args[]){
        int arr[]={5,1,6,3,4,2};

        selectionsort(arr);
        display(arr);
    }
    
}
