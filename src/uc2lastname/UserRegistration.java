package uc2lastname;

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
        boolean result = Pattern.matches("[A-Z]{1}[a-z]{2,}", LastName);
        if(result)
            System.out.println("Valid LastName");
        else
            System.out.println("Invalid... Please Enter Valid last name");
    }
    public static void main( String[] args )
    {
        UserRegistration user = new UserRegistration();
        user.firstName();
        user.lastName();
    }
}
