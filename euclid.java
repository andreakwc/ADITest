public static void main(args[]public class Euclid
{

   public static void main(String[] args)
   {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter an integer: ");
	int i = input.nextInt();
	System.out.println("Please enter another integer: ");
	int j = input.nextInt();
	int r;
	
	if (i==0||j==0)
          {
            j=0;
          }
        else
	{
		if (j>i) 
		{
		int m = j;
		j = i;
		i = m;
		}
	r=i%j;
	
     
	while (r!=0)
	   {
	     if (i>j)
	       {
		 i = j;
		 j= r;
		 r = i%j;	 	
	       }
	     else 
	       {
		 int k = j;
		 j = i;
		 i = k;
		 i = j;
		 j = r;
		 r = i%j;
	       }
	   }
	}
	System.out.println("The greatest common divisor is "+j);	
   }

	
}
){


}
