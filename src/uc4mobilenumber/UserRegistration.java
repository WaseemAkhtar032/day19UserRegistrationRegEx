package uc4mobilenumber;

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
        boolean result = Pattern.matches("^[a-c]+.([0-9a-z]+)*@[bl]+.[co]+.[in]$", Email);
        if(result)
            System.out.println("Valid Email");
        else
            System.out.println(" Invalid... Please Enter Valid Email Address");
    }

    public void mobileNumber() {
        System.out.println("Enter Mobile Number : ");
        String mobile = "91 8237791113";
        boolean result = Pattern.matches("^[0-9\\s]{3}[0-9]{10}$", mobile);
        if (result) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid.... Please Enter Valid Mobile Number");
        }
    }
    public static void main( String[] args )
    {
        UserRegistration user = new UserRegistration();
        user.firstName();
        user.lastName();
        user.email();
        user.mobileNumber();

    }
}
