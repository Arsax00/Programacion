package archivos;

import java.io.File;
import java.io.IOException;

public class ooo {

	public static void main(String[] args) {
			// averiguar si un archivo existe o no
	try {
		File file = new File("C:\\record.txt");
		if (file.createNewFile()) {
			System.out.println("New file is created");
		} else {
			System.out.println("File already exists");
		}
	} catch(IOException e) {
		e.printStackTrace();
	}
	
		}

	public ooo() {
		super();
	}

}