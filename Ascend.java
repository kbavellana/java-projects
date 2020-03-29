package hmh;
import java.util.Scanner;

public class Ascend {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		float I,D,T;
		int res;
		
		System.out.print("Enter a 1st number: ");
		I = sc.nextFloat();
		System.out.print("Enter a 2nd number: ");
		D = sc.nextFloat();
		System.out.print("Enter a 3rd number: ");
		T = sc.nextFloat();
		System.out.print("[1] - Ascending or [2] - Descending: ");
		res = sc.nextInt();
		
		switch(res)
		{
		 case 1:
         {
                  if ((I<D && D<T) || (I==D && D==T) || (I==D && I<T))
                 System.out.printf("\n \n \t %.2f---%.2f---%.2f",I,D,T);
             else if ((I<T && T<D) || (T==D && I<T))
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",I,T,D);
             else if  (D<I && I<T)
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",D,I,T);
             else if ((D<T && T<I) || (D==T && D<I) || (T==I && D<T))
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",D,T,I);
             else if ((T<I && I<D) || (T==I && T<D) || (I==D && T<I))
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",T,I,D);
             else if (T<D && D<I) 
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",T,D,I);
             else
            	 System.out.printf("\n \n Error 414."); break;
         }
         case 2:
         {
                  if ((I>D && D>T) || (I==D && D==T) || (I==D && I>T))
                	  System.out.printf("\n \n \t %.2f---%.2f---%.2f",I,D,T);
             else if ((I>T && T>D) || (T==D && I>T))
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",I,T,D);
             else if  (D>I && I>T)
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",D,I,T);
             else if ((D>T && T>I) || (D==T && D>I) || (T==I && D>T))
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",D,T,I);
             else if ((T>I && I>D) || (T==I && T>D) || (I==D && T>I))
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",T,I,D);
             else if (T>D && D>I) 
            	 System.out.printf("\n \n \t %.2f---%.2f---%.2f",T,D,I);
             else
            	 System.out.printf("\n \n Error 424."); break;
         }
         
         default: System.out.printf("\n \n Error 434.");break;
		}
	}
}
