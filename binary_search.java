import java.io.*;
public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={6,3,8,9,2,12,15,13};
        for(int i=0;i<arr.length;i++){
            int smallest=i;
            int size= arr.length;
            for(int j=i+1; j<size;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");


    }
    }
}
