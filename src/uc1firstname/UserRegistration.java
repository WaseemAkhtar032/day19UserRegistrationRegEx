package uc1firstname;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
       Scanner sc = new Scanner(System.in);
       public void firstName() {
            System.out.println("Enter First Name : ");
            String FirstName = sc.next();
            boolean result = Pattern.matches("[A-Z]{1}[a-z]{3,}", FirstName);
            if (result)
                System.out.println("Valid firstName");
            else
                System.out.println("Invalid... Please Enter Valid first name");
        }
        public static void main(String[] args) {
            UserRegistration user = new UserRegistration();
            user.firstName();
        }

    }
