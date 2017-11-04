package tree;

import java.io.File;

public class Digitar {  
    public Digitar(String input){
    	File file = new File(input);
    	file.
    	System.out.println(file.getAbsolutePath());
    	if (file.canWrite()) {
    		System.out.println("pode");
    	}else {
    		System.out.println("nao pode");
    	}
    }
}
