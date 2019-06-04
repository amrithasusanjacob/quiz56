

public class quiz56sol {

	public static void main(String[] args) {
		String name="SHIVAM";
       String r= studying(name);
       System.out.println(r);
       String name1="shivam";
       String r1= studying(name1);
       System.out.println(r1);
	}
   public static String studying(String name)
   {
	   int l=name.length();
	   int c=0;
	   for(int i=0;i<l;i++)
	   {
		   if((name.charAt(i)>='A')&&(name.charAt(i)<='Z'))
		   {
			   c=1;
		   }
		   else
		   {
			   c=0;
		   }
	   }
	   System.out.println(c);
	  if(c==1)
	  {
		  String s1=name+" IS STUDYING";
	      return s1;
	  }
	  else
	  {
		 String s= name+" is studying";
		 return s;
	  }
	  
   }
}
