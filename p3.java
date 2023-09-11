import java.util.*;
public class p3 {
    public static void main(String[] args) {
        String name;
        int maths, science, english, hindi, cts, rollno, total;
        double avg,percent;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Student Name:");
        name= sc.nextLine();
        System.out.print("Enter Student roll number");
        rollno=sc.nextInt();
        System.out.print("Enter marks in maths");
        maths=sc.nextInt();
        System.out.print("Enter marks in science");
        science=sc.nextInt();

        System.out.print("Enter marks in english");
        english=sc.nextInt();

        System.out.print("Enter marks in hindi");
        hindi=sc.nextInt();

        System.out.print("Enter marks in cts");
        cts=sc.nextInt();

        System.out.println("Enter Roll number");
        rollno= sc.nextInt();
        total= maths+ science+ english+ cts+ hindi;
        avg= total/5;
        percent= avg*0.01;
        System.out.println("Roll No. is :"+ rollno);
        System.out.println("Average Marks is :"+ avg);
        System.out.println("Students percentage is:"+ percent);
    }
}
