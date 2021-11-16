package package3;

import java.io.* ;
import java.lang.* ;


public class FileReadWrite {
    File folder ;  
	File file ;    
    private FileWriter writer ; 

    public void createDirectory()
	{
	
		
		try{
			folder = new File("F:/Projectfinal/files") ; 
			folder.mkdir() ;  // create the folder
			
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}
    }
    

    
    public void writeInFile(String s)
	{
	
		try
		{
			file = new File("borrow.txt") ; 
			
			file.createNewFile() ; 
			
			writer = new FileWriter(file, true) ; 
						
							
			writer.write(s+"\r\n") ; 
			writer.flush() ;         
			writer.close() ;		
		
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace() ;

		}
	}
	
}