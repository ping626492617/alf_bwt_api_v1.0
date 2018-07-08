package com.alf.api.commons.util;

import java.util.regex.Pattern;

public final class StringUtil {

	public static boolean isEmpty (String str){
		
		if(str == null || str.length() == 0 || str.equals("null")){
			return true;
		}
		return false;
	}

	public static boolean isNotEmpty (String str){
		
		if(str == null || str.length() == 0){
			return false;
		}
		return true;
	}
	
	/**
	 * 判断字符串是否为整数格式
	 * @param str
	 * @return
	 */
    public static boolean isNumeric(String str){  
        Pattern pattern = Pattern.compile("[0-9]*");  
        return pattern.matcher(str).matches();     
    }
}
