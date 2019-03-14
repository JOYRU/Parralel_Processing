import java.rmi.*;  
import java.rmi.registry.*;  
public class Working_PC3{  
public static void main(String args[]){  
try{  
Adder stub3=new AdderRemote();  
Naming.rebind("rmi://localhost:3000/sonoo",stub3);  
}catch(Exception e){System.out.println(e);}  
}  
}  