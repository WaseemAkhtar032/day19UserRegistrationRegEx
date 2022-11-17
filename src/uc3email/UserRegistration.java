package uc3email;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);
    public void firstName() {
        System.out.println("Enter First Name : ");
        String FirstName = sc.next();
        boolean result = Pattern.matches("[A-Z][a-z]{2,}", FirstName);
        if(result)
            System.out.println("Valid firstName");
        else
            System.out.println("Invalid... Please Enter Valid first name");
    }

    public void lastName() {
        System.out.println("Enter Last Name : ");
        String LastName = sc.next();
        boolean result = Pattern.matches("[A-Z][a-z]{2,}", LastName);
        if(result)
            System.out.println("Valid LastName");
        else
            System.out.println("Invalid... Please Enter Valid last name");
    }

    public void email() {
        System.out.println("Enter the Email : ");
        String Email = sc.next();
        boolean result = Pattern.matches("^[a-c]+.([0-9a-z]+)*@[bl]+.[co]{2,3}+.[in]{2,3}$", Email);
        //boolean result = Pattern.matches("^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$", Email);
        if(result)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid... Please Enter Valid Email Adderss");
    }
    public static void main( String[] args )
    {
        UserRegistration user = new UserRegistration();
        user.firstName();
        user.lastName();
        user.email();
    }
}
