package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {
    //Check regex for first name
    public void validFirstName(String firstName){

        String nameVar = "^[A-Z][a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(nameVar);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("Valid first name");
        }else {
            System.out.println("Invalid first name");
        }
    }
    //Check regex for last name
    public void validLastName(String lastName){

        String nameVar = "^[A-Z][a-zA-Z]{2,}$";

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

        String emailVar = "^[a-z0-9]{3,20}([_.+-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,3}(.[a-z]{2})?";

        Pattern pattern = Pattern.compile(emailVar);
        Matcher matcher = pattern.matcher((emailId));
        if(matcher.matches()){
            System.out.println("Valid Email Id ");
        }
        else {
            System.out.println("Invalid Email Id ");
        }
    }
    //Check regex for Mobile Format
    public void validMobileFormat(String mobileNo){

        String MobileNoVar = "^[0-9]{2}\\s?[0-9]{10}$";

        Pattern pattern = Pattern.compile(MobileNoVar);
        Matcher matcher = pattern.matcher((mobileNo));
        if(matcher.matches()){
            System.out.println("Valid Mobile Number ");
        }
        else {
            System.out.println("Invalid Mobile No ");
        }
    }
    //Check regex for Validation password
    public void validationPassword(String password){

        String passwordVar = "^(?=.*\\d)(?=.*[A-Z])[a-zA-Z0-9@#$%^&*()]{8,}$";

        Pattern pattern = Pattern.compile(passwordVar);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }
    }
}
