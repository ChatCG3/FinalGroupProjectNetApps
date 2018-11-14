package dbhelpers;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	public static boolean isUsername(String username){
		// if username is empty
		if (username == null){
			return false;	
		} else if (username.equals("") || username.isEmpty()){
		   return false;	
		}
		return true;
	}
	
	public static boolean isPassword(String password){
		// if password is empty
		if (password == null){
			return false;	
		} else if (password.equals("") || password.isEmpty()){
		   return false;	
		}
		return true;
	}	
	
	public static boolean isLongPassword(String password){
		// if name is empty
		if (password.length() < 9){
		   return false;	
		}
		return true;
	}	
	
	public static boolean isName(String name){
		// if name is empty
		if (name == null){
			return false;	
		} else if (name.equals("") || name.isEmpty()){
		   return false;	
		}
		return true;
	}
	
	public static boolean isShortName(String name){
		// if name is empty
		if (name.length() > 15){
		   return false;	
		}
		return true;
	}
	
	public static boolean isDate(String date) {
	    if (date == null || !date.matches("\\d{4}-[01]\\d-[0-3]\\d")){
	        return false;
	    }
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    df.setLenient(false);
	    try {
	        df.parse(date);
	        return true;
	    } catch (ParseException ex) {
	        return false;
	    }
	}
	
	public static boolean isEmail(String emailStr) {
		Pattern emailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailRegex.matcher(emailStr);
		return matcher.find();
	}
	
	public static boolean isPhone(String phoneStr) {
		Pattern phoneRegex = Pattern.compile("^(?=.{7,32}$)(\\(?\\+?[0-9]*\\)?)?[0-9_\\- \\(\\)]*((\\s?x\\s?|ext\\s?|extension\\s?)\\d{1,5}){0,1}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = phoneRegex.matcher(phoneStr);
		return matcher.find();
	}
	
	
}

