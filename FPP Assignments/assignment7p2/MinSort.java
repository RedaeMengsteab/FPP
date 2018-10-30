package assignment7p2;
import java.util.Arrays;

public class MinSort {
	String sort(String s)
	{
	//	StringBuilder sortedString=new StringBuilder();
		  if(s==null || s.length()<=1)
			     return s;
		  char min=minPos(s);
		return min + sort(swap(min,s));
		
	}
    
	private String swap(Character minPos, String s) {	
		return s.substring(0,s.indexOf(minPos))+s.substring(s.indexOf(minPos)+1);
//  	      char[] names=s.toCharArray();     
//		for(int i=0;i<names.length;i++)
//	         {
//	        	   if(names[i]==minPos)
//	        	   {
//	        		   char temp=names[i];
//	        		   names[i]=names[0];
//	        		   names[0]=temp;
//	        	   }
//	        		   
//	         }
//		 String d=new String(names);
//		 return d.substring(1);
	}

	Character minPos(String str)
     {
    	 if(str==null || str.length()==0)
 			return null;
 		char ch=str.charAt(0);
 		if(str.length()==1) return ch;
 		char c=minPos(str.substring(1));
 		return (ch<c?ch:c);
     }
	
  public static void main(String args[])
  {
	  
	  MinSort ms = new MinSort();
	 String result = ms.sort("zwxuabfkafutbbbb");
	  
	 System.out.println(result);
  }


}
