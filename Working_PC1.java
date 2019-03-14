import java.rmi.*;  
import java.rmi.registry.*;  
public class Working_PC1{  
public static void main(String args[]){  
try{  
Adder stub1=new AdderRemote();  
Naming.rebind("rmi://localhost:5000/sonoo",stub1);  
}catch(Exception e){System.out.println(e);}  
}  
}  