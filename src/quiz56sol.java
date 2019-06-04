import java.util.Scanner;

public class quiz56sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the name");
		String name=obj.nextLine();
       String r= studying(name);
       System.out.println(r);
	}
   public static String studying(String name)
   {
	  String n="null";
	  if(name.equals(n))
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
