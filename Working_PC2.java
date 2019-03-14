import java.rmi.*;  
import java.rmi.registry.*;  
public class Working_PC2{  
public static void main(String args[]){  
try{  
Adder stub2=new AdderRemote();  
Naming.rebind("rmi://localhost:4000/sonoo",stub2);  
}catch(Exception e){System.out.println(e);}  
}  
}  