package com.bridgelabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {
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
}
