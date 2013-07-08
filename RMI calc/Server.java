import java.rmi.*;
public class Server {
 
	public Server()
	{
		try
		{
			Validator remObj=new ValidatorImpl();
			Naming.rebind("rmi://localhost:1095/ValidatorService", remObj);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	    new Server();
	}

}