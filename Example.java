import java.util.Scanner;
public class Example{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //String str="abcdf";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1 +str.charAt(i);
        }
        sc.close();
        System.out.println("Reversed string is:"+str1);
       
    }
   
}
