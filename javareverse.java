public class javareverse {
    public static void main(String[] args) {
        String str="jay esh";
       String  str1=str.replaceAll(" ","");
        String rev=" ";
        for(int i=str1.length()-1;i>=0;i--){
            rev=rev+str1.charAt(i);
        } 
        System.out.println(rev);
    }
}
