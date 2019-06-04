

public class quiz56sol {

	public static void main(String[] args) {
	   String name="sivam,romil";
       String r= studying(name);
       System.out.println(r);
       String name1="joan,Carolini";
       String r1= studying(name1);
       System.out.println(r1);
	}
   public static String studying(String name)
   {
	   int l=name.length();
	   int pos=0;
	   for(int i=0;i<l;i++)
	   {
		   if(name.charAt(i)==',')
		   {
			   pos=i;
		   }		   
	   }
	  String s1=name.substring(0,pos);
	  String s2=name.substring(pos+1,l);
	  String s3 = s1+" and "+s2+" are studying";
	  return s3;

   }
}
