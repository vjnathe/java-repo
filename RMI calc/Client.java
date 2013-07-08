import java.rmi.*;
public class Client {

	public static void main(String[] args) {
		
		
		    try
                    { 
			Validator remObj=(Validator)Naming.lookup("rmi://localhost:1099/ValidatorService");

			System.out.println( remObj.validate("(())()") ? "Valid" : "Invalid");
			    	     
		    }catch(Exception e)
		    {
			System.out.println(e);
		    }

	}

}
