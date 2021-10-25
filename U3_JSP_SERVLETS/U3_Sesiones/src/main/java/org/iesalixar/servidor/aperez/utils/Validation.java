package org.iesalixar.servidor.aperez.utils;

import java.util.regex.Pattern;

public class Validation {
	// alphanumeric and underscore are allowed
    private static final String USERNAME_REGEX = "^[a-zA-Z0-9_]+$";
    private static final Pattern USERNAME_PATTERN = Pattern.compile(USERNAME_REGEX);
 
    // local-part + @ + domain part
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*" +
            "@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
 
    // 8-16 characters password with at least one digit, one lowercase letter,
    // one uppercase letter, one special character with no whitespaces
    private static final String PASSWORD_REGEX =
        "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
 
    // Date in US format with support for leap years
    private static final String DATE_REGEX =
            "^(?:(?:(?:0?[13578]|1[02])(\\/|-|\\.)31)\\1|" +
            "(?:(?:0?[1,3-9]|1[0-2])(\\/|-|\\.)(?:29|30)\\2))" +
            "(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:0?2(\\/|-|\\.)29\\3" +
            "(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|" +
            "[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|" +
            "^(?:(?:0?[1-9])|(?:1[0-2]))(\\/|-|\\.)(?:0?[1-9]|1\\d|" +
            "2[0-8])\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final Pattern DATE_PATTERN = Pattern.compile(DATE_REGEX);
    
    public static boolean validateUsername(String u) {
    	return USERNAME_PATTERN.matcher(u).matches();
    }
    
    public static boolean validateEmail(String e) {
    	return EMAIL_PATTERN.matcher(e).matches();
    }
    
    public static boolean validatePassword(String p) {
    	return PASSWORD_PATTERN.matcher(p).matches();
    }
    
    public static boolean validateDate(String d) {
    	return DATE_PATTERN.matcher(d).matches();
    }
}