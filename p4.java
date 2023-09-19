import java.util.*;
public class p4 {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner (System.in);
        for(int i=0; i<5;i++){
            int n=sc.nextInt();
            arr[i]=n;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
    
}
