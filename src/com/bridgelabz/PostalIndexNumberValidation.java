package com.bridgelabz;

/**
 * Restrict pin Code for taking alphabets or special characters at end
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalIndexNumberValidation {
    /**
     * Creating isValidPinCode to validate given pinCode and return true or false
     *
     * @param pinCode - Takes the given pinCode
     * @return true if the regex matched else false
     */
    public static boolean isValidPinCode(String pinCode) {
        /**
         * Regex to check valid pin code of India.
         */
        String regex = "^(?![a-zA-Z-!@#$%^&*()_+=<>?/])[1-9]{1}[0-9]{5}(?![a-zA-Z-!@#$%^&*()_+=<>?/])$";

        /**
         * Compiling the ReGex
         */
        Pattern pattern = Pattern.compile(regex);

        /**
         * If the pin code is empty return false
         */
        if (pinCode == null) {
            return false;
        }

        /**
         * Pattern class contains matcher() method to find matching between
         * given pin code and regular expression.
         */
        Matcher matcher = pattern.matcher(pinCode);

        /**
         * Return if the pin code matched the Regex
         */
        return matcher.matches();
    }

    /**
     * Main method from where the execution gets started
     * @param args - default java param
     */
    public static void main(String args[]) {
        /**
         * PROCEDURE:
         * 1.Test Case for checking 400088
         * 2.Test Case for checking A400088
         * 3.Test Case for checking 400088B
         */

        /**
         * 1.Test Case for checking 400088
         */
        String pinCode1 = "400088";
        System.out.println(pinCode1 + ": " + isValidPinCode(pinCode1));
        /**
         * 2.Test Case for checking A400088
         */
        String pinCode2 = "A400088";
        System.out.println(pinCode2 + ": " + isValidPinCode(pinCode2));
        /**
         * 3.Test Case for checking 400088B
         */
        String pinCode3 = "400088B";
        System.out.println(pinCode3 + ": " + isValidPinCode(pinCode3));
    }
}
