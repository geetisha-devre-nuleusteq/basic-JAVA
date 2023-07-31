package JAVADayThree;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String... ar) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\Users\\geeti\\eclipse-workspace\\JavaBasics\\src\\JavaDay2/helloWorld");

			fw = new FileWriter("C:\\Users\\geeti\\eclipse-workspace\\JavaBasics\\src\\JavaDay2/helloWorld1");
			int ch = 0;
			String str = "";
			while ((ch = fr.read()) != -1) {
				fw.write((char) ch);
				str = str + (char) ch;

			}
			System.out.println(str);
		} catch (FileNotFoundException ex) {
			System.out.println("exception" + ex);
			
			/////question8
			
		} finally {
			if (fr.equals(null)) {
				fr.close();
			}
			if (fw.equals(null)) {
				fw.close();
			}
		}
	}

}
