package ai.jobiak.collections;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.*;



public class TestHashSet2 {

	public static void main(String[] args) {
		
		
		HashSet colors = new HashSet();//by default the java collections are generic -wider or widest
		
		
		colors.add("green");
		colors.add("blue");
		colors.add("yellow");
		colors.add("purple");
		colors.add("black");
		colors.add("white");
		colors.add("pink");
		
	
	    LocalDateTime dt =LocalDateTime.now();
		colors.add(dt);
		colors.add(new Boolean("false"));
    //  colors.add(new BigInteger("100"));
        colors.add(new Object());
		 
        //for(String obj:colors) {}
		
        Iterator iter = colors.iterator();
        
        while(iter.hasNext()) {	
        
        Object obj=iter.next();
         if(obj instanceof String) {
        	 String str=(String)iter.next();
        	 System.out.println(str);
         }
       
       } 	
        System.out.println(colors.size());
    }
}


