package com.bridgelabz.regex;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        //simple print welcome
        System.out.println("Welcome To Regex Program");

        //Taking scanner
        Scanner sc =new Scanner(System.in);
        RegexValidation rv = new RegexValidation();

        //Enter first name
        System.out.println("Enter the first name : ");
        String firstName = sc.next();
        rv.validFirstName(firstName);

        //Enter last name
        System.out.println("Enter the last name : ");
        String lastName = sc.next();
        rv.validLastName(lastName);

        //Enter email id
        System.out.println("Enter the e-mail id: ");
        String emailId = sc.next();
        rv.validEmailAddress(emailId);

        //Enter Mobile Number format
        System.out.println("Enter the Mobile No :");
        String mobileNo = sc.next();
        rv.validMobileFormat(mobileNo);
    }
}
