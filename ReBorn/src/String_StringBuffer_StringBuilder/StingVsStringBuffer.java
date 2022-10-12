package String_StringBuffer_StringBuilder;

public class StingVsStringBuffer {

	public static void main(String[] args) {
		String s = new String("Omsai");
		s.concat("SaiRam");  //Another Object is Created and we are not giving any reference to this object
		System.out.println(s);//As String is immutable we can not bring changes
		
		
		
		String s1 = s.concat("ram");
		System.out.println(s1);
		
		
		StringBuffer sb1 = new StringBuffer("Suri");
		sb1.append("babu");
		System.out.println(sb1);
		

	}

}
