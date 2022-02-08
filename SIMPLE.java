import java.io.*;

public class SIMPLE {
	
	public static void main(String ARGS[]) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\simple\\output\\output.txt"));
			int x = 20, y = 100, z;
			z = x + y;

			bw.write("hello world this is Qasim " + z);
			bw.close();
		} catch (Exception ex) {
			return;
		}

	}

}
