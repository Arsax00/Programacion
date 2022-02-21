package actividad7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SO {
	
private static String OS = System.getProperty("os.name").toLowerCase();


public static void main(String []args) {
	
	System.out.println("os.name "+OS);
	
	
	if(isWindows()) {
		
		System.out.println("this is windows");
	}
		else if(isLinux()) {
			System.out.println("this is linux");
		}
		
		else {
			System.out.println("no soportado");
		}
	
File directorio = new File("C:\\Users\\Invitado21-22-11\\Desktop\\DAM\\programasao\\Directorios\\JAVASamples");


if(!directorio.exists()) 
	
    if(directorio.mkdirs()) {
    	
    	System.out.println("Directorio creado");
    	try {
    		File file = new File("C:\\Users\\Invitado21-22-11\\Desktop\\DAM\\programasao\\Directorios\\JAVASamples\\OSDetect.txt");
    		if (file.createNewFile()) {
    			System.out.println("New file is created");
    		} else {
    			System.out.println("File already exists");
    		}
    	} catch(IOException e) {
    		e.printStackTrace();
    	}	
    }else {
    		    	
    	System.out.println("Error al crear directorio ");
    }

}
	public static boolean isWindows() {
		
		return(OS.indexOf("windows")>=0);
				
	}
	public static boolean isLinux () {
		return (OS.indexOf("linux") >= 0);
	}

}
