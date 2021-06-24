package GenerateLocaleList;
import java.util.Locale;

public class LocaleList {

	public static void main(String[] args) {
		Locale locale;
//		System.out.println(locale.getDisplayCountry());//현재 설정된 나라언어
//		System.out.println(locale.getDisplayName());//현재 설정된 언어 및 나라
//		System.out.println(locale.getLanguage());//현재 설정된 언어
//		locale.getDisplayName(Locale.KOREA)// 현재 설정된 언어를 Locale.*의 언어의 형식으로 출력
//		for(Locale locale : Locale.getAvailableLocales()) {
//			System.out.println(locale.getISOCountries());
//			System.out.println(locale.getISOLanguages());
//		}
//		for(String country : Locale.getISOCountries()) { //ISO 코드 출력
//			System.out.println("========================================");
//			System.out.println(country);//ISO 표준 나라 코드
//			locale = new Locale("ko",country); //언어, 나라 설정 
//			
//			System.out.println(locale.getDisplayName());
//		}
		
		for(String language : Locale.getISOLanguages()) { //ISO 코드 출력
            System.out.println("========================================");
            System.out.println(language);//ISO 표준 나라 코드
            locale = new Locale(language,"KR"); //언어, 나라 설정 
            System.out.println(locale.getDisplayName());
		}
		
		
	}
}
