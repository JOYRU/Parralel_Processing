import java.rmi.*;  
import java.rmi.registry.*;  
public class Working_PC5{  
public static void main(String args[]){  
try{  
Adder stub5=new AdderRemote();  
Naming.rebind("rmi://localhost:1000/sonoo",stub5);  
}catch(Exception e){System.out.println(e);}  
}  
}  