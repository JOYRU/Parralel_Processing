import java.rmi.*;  
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ControlPC{  
public static void main(String args[]) throws IOException{  
try{  
Adder stub1=(Adder)Naming.lookup("rmi://localhost:5000/sonoo");
Adder stub2=(Adder)Naming.lookup("rmi://localhost:4000/sonoo");
Adder stub3=(Adder)Naming.lookup("rmi://localhost:3000/sonoo");
Adder stub4=(Adder)Naming.lookup("rmi://localhost:2000/sonoo");
Adder stub5=(Adder)Naming.lookup("rmi://localhost:1000/sonoo");



     int[] arr1 = new int[1000] ; 
	 int[] arr2 = new int[1000] ; 
	 int[] arr3 = new int[1000] ; 
	 int[] arr4 = new int[1000] ; 
      int[] arr5 = new int[1000] ; 
	 
	 int i,j;
     i=0;
     j=0;
     Scanner s = null;
	 BufferedWriter bw = null;
	 FileWriter fw = null;
	 
    try {   
         s = new Scanner(new BufferedReader(new FileReader("input.txt")));  

        //String content = "This is the content to write into file\n";

		fw = new FileWriter("output.txt");
		bw = new BufferedWriter(fw);
		//bw.write(content);		 
            
            
            
         while (s.hasNext()) {   
            
			 if(j==5)
				 j=0;
			 
			 
			
			if(i<5){
            arr1[j]=s.nextInt();  
            System.out.println(arr1[j]) ; 
            j++;
			}
			else if(i<10){
				 arr2[j]=s.nextInt();  
            System.out.println(arr2[j]) ; 
              j++;
			}
			/*else if(i<=9){
				 arr3[j]=s.nextInt();  
            System.out.println(arr1[j]) ; 
              j++;
			}
			
			else if(i<=12){
				 arr4[j]=s.nextInt();  
            System.out.println(arr1[j]) ; 
              j++;
			}*/			
			/*else{
			 arr5[j]=s.nextInt();  
            System.out.println(arr1[j]) ; 
              j++;	
			}*/
			
			i++ ; 
             
         }
 
     } 
             catch (FileNotFoundException e) {   
         // TODO Auto-generated catch block   
         e.printStackTrace();   
     }    
         
     
     finally {   
         if (s != null) {   
             s.close();   
         }   
     }   
	 
	 
	 


   

//int[] arr = new int[]{1,2,3,4,5} ; 
 //System.out.println(stub1.add(arr1)+stub2.add(arr2)+stub3.add(arr3)+stub4.add(arr4)+stub5.add(arr5)); 
 System.out.println(stub1.add(arr1)+stub2.add(arr2));
 //bw.write(stub1.add(arr1)+stub2.add(arr2)) ;
//System.out.println(stub.add(34,4));  
}catch(Exception e){}  
}

}  
  