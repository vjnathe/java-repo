import java.rmi.*;
public interface Validator extends Remote{

	public boolean validate(String s) throws RemoteException;
	}


