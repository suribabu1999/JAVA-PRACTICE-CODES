package AppletPractice;
import java.io.*;

public class First_Applet {
 
public static void main(String[] args) throws IOException 
    {
	 char c;
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.println(" Quit enter 'q");
	 
	 do {
		 c = (char) br.read();
		 System.out.println(c);
	 }while(c != 'q');
    }
}
