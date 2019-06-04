

public class quiz56sol {

	public static void main(String[] args) {
		String name=null;
       String r= studying(name);
       System.out.println(r);
       String name1="Shivam";
       String r1= studying(name1);
       System.out.println(r1);
	}
   public static String studying(String name)
   {
	  
	  if(name==null)
	  {
		  String s1="Nobody is studying";
	      return s1;
	  }
	  else
	  {
		 String s= name+" is studying";
		 return s;
	  }
   }
}
