import java.util.Scanner;

public class Authentication{

public static void main(String[] args) {
   String Username= "CSC200";
   String Password ="password";
   System.out.println("Enter the username");
   Scanner scanner = new Scanner(System.in);
   String user1=scanner.next();
   System.out.println("Enter the password");
   Scanner scanner1 =  new Scanner(System.in);
   String pass1=scanner1.next();
if((Username.equals(user1))&& (Password.equals(pass1))){
       System.out.println("Welcome User!");

    }
else{
       System.out.println("Login failed. Invalid Username and password");
        }
}}


