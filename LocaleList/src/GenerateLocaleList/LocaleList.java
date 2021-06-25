package GenerateLocaleList;
import java.util.Locale;

public class LocaleList {

	public static void main(String[] args) {
		Locale locale;
		
		String language = "fr"; // 언어선택

		for(String country : Locale.getISOCountries()) { //선택된 언어로 나라리스트 출력
            locale = new Locale(language,country);
            System.out.println(country); // ISO 코드
            System.out.println(locale.getDisplayCountry(new Locale(language))); // 나라명
            System.out.println("------------------");
		}
		
		for (Locale locale2 : Locale.getAvailableLocales()) { // 선택된 언어를 사용하는 나라 목록
			if(language == locale2.getLanguage()) {
				System.out.println("getLanguage : " + locale2.getLanguage());
                System.out.println("getCountry : " + locale2.getCountry()); 
                System.out.println("getDisplayName : " + locale2.getDisplayName());
                System.out.println("getDisplayLanguage : " + locale2.getDisplayLanguage());
                System.out.println("getDisplayCountry : " + locale2.getDisplayCountry());
                System.out.println("===================");
	        }
		}
		
		
	}
}
