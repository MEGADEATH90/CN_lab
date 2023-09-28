//Reading a character
package exp2;
import java.io.*;
public class e2 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = (char)br.read();
		System.out.println(c);
	}

}
