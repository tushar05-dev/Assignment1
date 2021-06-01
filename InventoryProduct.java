
import java.util.Vector;

public class InventoryProduct {

	    public static void main(String arg[]) {   
	    
	    	
	    	
	        Vector<Integer> vecObject = new Vector<Integer>(100);  
	       
	        vecObject.add(5);  
	        vecObject.add(3);  
	        vecObject.add(4);  
	        
	        vecObject.remove(2);
	        vecObject.remove(0);
	        vecObject.add(6);
	        vecObject.add(11);
	        vecObject.add(45);
	        vecObject.add(99);
			
	        System.out.println("Values in vector after added & removed: " +vecObject);  
	   
	       
	    }              
	}  

