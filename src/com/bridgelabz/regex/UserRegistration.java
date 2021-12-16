package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //simple print welcome
        System.out.println("Welcome To Regex Program");

        //Taking scanner
        Scanner sc =new Scanner(System.in);
        RegexValidation rv = new RegexValidation();

        //Type first name here
        System.out.println("Enter the first name : ");
        String firstName = sc.next();
        rv.validFirstName(firstName);

    }
}
