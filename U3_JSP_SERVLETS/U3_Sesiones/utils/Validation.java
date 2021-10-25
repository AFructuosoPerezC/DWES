package org.iesalixar.servidor.aperez.utils;

import java.util.regex.Pattern;

public class Validation {
	private static final String NAME_REGEX = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
    private static final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);
 
    // local-part + @ + domain part
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*" +
            "@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
 
    public static boolean validateName(String n) {
    	return NAME_PATTERN.matcher(n).matches();
    }
    
    public static boolean validateEmail(String e) {
    	return EMAIL_PATTERN.matcher(e).matches();
    }
}