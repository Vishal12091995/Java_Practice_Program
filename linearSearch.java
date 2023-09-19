import java.util.*;
public class linearSearch {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,1,10,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be searched");
        int num= sc.nextInt();
        boolean flag=false;
        int i=0;
        while(i<arr.length){
            if(arr[i]==num){
                flag=true;
                break;
            }else{
                i++;
            }
        }
        if(flag){
            System.out.println("Number found ");
        }else{
            System.out.println("number not found");
        }
    }
}
