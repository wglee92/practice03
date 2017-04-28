package prob04;

public class StringUtil {
    private static String d = "";

	public static String concatenate(String[] str) {
    		for (int i=0; i<str.length; i++) {
    			d += str[i];
    		}
    		return d;
    		
    }
    	//문자열을 결합하여 리턴 하는 메소드 구현
}

