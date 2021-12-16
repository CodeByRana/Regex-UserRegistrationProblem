package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {
    //Check regex for first name
    public void validFirstName(String firstName){

        String nameVar = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(nameVar);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("Valid first name");
        }else {
            System.out.println("Invalid first name");
        }
    }
    //Check regex for first name
    public void validLastName(String lastName){

        String nameVar = "^[A-Z]{1}[a-z]{2,}$";

        Pattern pattern = Pattern.compile(nameVar);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()){
            System.out.println("Valid last name");
        }else {
            System.out.println("Invalid last name");
        }
    }
    //Check regex for email address
    public void validEmailAddress(String emailId){

        String emailVar = "^[a-z]{3,}?.[a-zA-Z0-9-._+]{1,}@[a-z]{2,}.[a-z]{2,}";

        Pattern pattern = Pattern.compile(emailVar);
        Matcher matcher = pattern.matcher((emailId));
        if(matcher.matches()){
            System.out.println("Valid Email Id ");
        }
        else {
            System.out.println("Invalid Email Id ");
        }
    }
}
