import java.util.*;public class findrepeatingelement {
    public static void main(String args[])
    {
        int arr[]={10,2,3,2,30,40,50};

        Arrays.sort(arr);
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
            System.out.println(arr[i]+" ");
        }}
    }
    
}
//wrong 
