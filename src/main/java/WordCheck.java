import org.apache.commons.lang3.StringUtils;

public class WordCheck {

    public static boolean stringComparison(String str1, String str2) {

        if (lengthCheck(str1, str2)){
            if(letterComparison(str1, str2)){
                return true;
            }
        }
        return false;
    }

    public static boolean lengthCheck(String str1, String str2){
        return str1.length() == str2.length();
    }

    public static boolean letterComparison(String str1, String str2) {
        String str1ToLowerCase = str1.toLowerCase();
        String str2ToLowerCase = str2.toLowerCase();

        for (int i = 0; i < str1ToLowerCase.length(); i++) {
            char charFromStr1 = str1ToLowerCase.charAt(i);

            int charCountFromStr1 = StringUtils.countMatches(str1ToLowerCase, charFromStr1);
            int charCountFromStr2 = StringUtils.countMatches(str2ToLowerCase, charFromStr1);

            if (charCountFromStr1 != charCountFromStr2){
                return false;
            }
        }
        return true;
    }
}
