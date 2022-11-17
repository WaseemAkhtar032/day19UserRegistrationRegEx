package uc9samplemails;

import java.util.Scanner;
import java.util.regex.Matcher;
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
    public void email() {
        System.out.println("Enter the Email : ");
        String Email = sc.next();
        boolean result = Pattern.matches("^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$", Email);
        if(result)
            System.out.println("Valid Email");
        else
            System.out.println("Invalid... Please Enter Valid Email Adderss");
    }
    public void mobileNumber() {
        System.out.println("Enter Mobile Number : ");
        String Mobile = sc.next();
        boolean result = Pattern.matches("^[0-9\\s]{3}[0-9]{10}$", Mobile);
        if(result)
            System.out.println("Valid Mobile Number");
        else
            System.out.println("Invalid.... Please Enter Valid Mobile Number");
    }


    public void password() {
        String password = "Wasee117@";
        int n = password.length();
        if (n > 7) {
            boolean result = Pattern.matches("^(?=.*[A-Z]).{8,}$", password);
            if (result) {
                System.out.println("Valid Password");
            }
            else {
                System.out.println("Invalid Password");
            }
        }
        else {
            System.out.println("Invalid Password");

        }
    }

    public void sampleEmails() {
        String[] emails = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com",

                "abc","abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
                "abc@%*.com", "abc..2002gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
                "abc@gmail.com.aa.au" };

        System.out.println("Checking sample emails for valid or invalid");


        for (int i = 0; i < emails.length; i++) {

            String regex = "^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(emails[i]);


            if (matcher.matches()) {
                System.out.println("Valid Email :" + emails[i]);
            }
            else {
                System.out.println("Invalid Emails : " + emails[i]);
            }

        }
    }
    public static void main( String[] args )
    {

        UserRegistration user = new UserRegistration();
        user.firstName();
        user.lastName();
        user.email();
        user.mobileNumber();
        user.password();
        user.sampleEmails();
    }

}
