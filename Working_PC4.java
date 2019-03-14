import java.rmi.*;  
import java.rmi.registry.*;  
public class Working_PC4{  
public static void main(String args[]){  
try{  
Adder stub4=new AdderRemote();  
Naming.rebind("rmi://localhost:2000/sonoo",stub4);  
}catch(Exception e){System.out.println(e);}  
}  
}  