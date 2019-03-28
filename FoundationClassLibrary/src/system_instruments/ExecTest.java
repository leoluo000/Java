package system_instruments;

public class ExecTest {

	public static void main(String[] args) throws Exception{
		
		try {  
		    Runtime rt = Runtime.getRuntime();  
		    Process proc = rt.exec("javac");  
		    int exitVal = proc.waitFor();  
		    System.out.println("Process exitValue: " + exitVal);  
		} catch (Throwable t) {  
		    t.printStackTrace();  
		}  

	}

}
