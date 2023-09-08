import java.util.*;
public class p1{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your limit");
        int i= sc.nextInt();
        if(i<=18){
            System.out.println("You are Eliginle to vote");
        }else{
            System.out.println("You are not Eligible for vote");
        }

    }
}