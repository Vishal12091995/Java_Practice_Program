/*Question
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123”

 */


import java.util.*;
public class p6String {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("email:");
        String str= sc.nextLine();
        String newStr="";
        for(int i=0; i<str.length();i++){

            if(str.charAt(i) =='@'){
                break;
            }else{
                newStr=newStr+ str.charAt(i);
            }
        }
        System.out.println("Original:"+str+ "  new:"+ newStr);
    }
}
