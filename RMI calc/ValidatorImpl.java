import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.Stack;

public class ValidatorImpl extends UnicastRemoteObject implements Validator{

	

	protected ValidatorImpl() throws RemoteException 
	{
		super();
	}
	
	public boolean validate(String s) throws RemoteException
       {
            Stack<Character>stack=new Stack();
            for(int i=0;i<s.length();i++)
            {
               char c=s.charAt(i);
                    
               if(c=='(')
               stack.push(new Character(c));
               
               if(c==')')
               {
                 if(stack.empty())
                 return false;
                 stack.pop();
               }
           }
           if(stack.empty())
           return true;
           return false;
       }
}