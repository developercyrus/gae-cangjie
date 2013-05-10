import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

	public static void main(String[] args) throws IOException {
		String path = Reader.class.getResource("cj5-21000").getFile();
		BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream(path), "UTF-16LE" ) );
		String line;		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}

