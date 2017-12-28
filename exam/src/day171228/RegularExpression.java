package day171228;

import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[]args) {
		String ss="s^";
		if(assertThat(true,is(matched(ss,"string")))) {
			
		}
	}
	private static boolean matched(String regex, String inputTxt) {
		return Pattern.matches(regex, inputTxt);
	}
}
