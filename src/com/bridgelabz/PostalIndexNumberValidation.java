package com.bridgelabz;

/**
 * Create a regex pattern to validate PIN code 400088
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalIndexNumberValidation {
    /**
     * Creating isValidPinCode to validate pinCode and return true or false
     *
     * @param pinCode - Takes the given pinCode
     * @return true if the regex matched else false
     */
    public static boolean isValidPinCode(String pinCode) {
        /**
         * Regex to check valid pin code of India.
         */
        String regex = "[1-9]{1}[0-9]{5}$";

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
         * Return if the pin code matched the ReGex
         */
        return matcher.matches();
    }

    public static void main(String args[]) {

        /**
         * Test Case for checking 400088
         */
        String pinCode = "400088";
        System.out.println(pinCode + ": " + isValidPinCode(pinCode));
    }
}
