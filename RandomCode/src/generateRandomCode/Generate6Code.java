package generateRandomCode;
public class Generate6Code {

	public static void main(String[] args) {
		double dValue = 0.0;
		int iValue = 0;
		int[] value = new int[6];
		StringBuffer buf = new StringBuffer();
		
		for (int i = 0; i < 6; i++) {
			while (iValue == 0) {
				dValue = Math.random();
				iValue = (int) (dValue * 10);
			}
			value[i] = iValue;
			iValue = 0;
		}
		
		for (int i = 0; i < value.length; i++) {	 
			buf.append(value[i]);
		}
		
		System.out.println(buf.toString());// return

	}

}
