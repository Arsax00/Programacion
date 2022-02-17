package archivos;

import java.io.File;
import java.io.IOException;

public class CreateDirs {
	public static void main(String[]args) throws IOException {
		File directorio= new File("Directorios\\directorio_nuevo");
		if(!directorio.exists()) {
			
	    if(directorio.mkdirs()) {
	    	
	    	System.out.println("Directorio creado");
	    	
	    }else {
	    		    	
	    	System.out.println("Error al crear directorio");
	    }
		}
	}
}
