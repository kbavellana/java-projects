import java.util.Scanner;
	public class Menu {
		static Scanner sc = new Scanner(System.in);
		public static void main(String args[])
		{
			float I,D,T;
			int res,menu,c2,res_exit=0;
			int age, sex, ia=0;
			do
			{
			System.out.println("\n\n\n 1. IPA \n 2. +/- \n 3. Ascending / Descending \n 4. Exit");
			System.out.print("Enter a Number:");
			menu = sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("");
				System.out.println("[0]Male or [1]female?     ");
				sex = sc.nextInt();
				System.out.print("Enter your age:     ");
				age = sc.nextInt();
				
				
				switch(sex)
				{
					case 0: 
					ia = (age/2) + 7;
					break;
					case 1:
					ia = (age-7)*2;
					break;
					default: 
				}
				
				System.out.println("Your ideals partner age is : "+ ia );
				break;
				
			case 2:
				System.out.print("Enter An integer:");
				c2 = sc.nextInt();
				if(c2 < 0)
					System.out.print("Negative yon");
				else if(c2 > 0)
					System.out.print("Positive yon.");
				break;
			case 3:
				System.out.print("Enter a 1st number:    ");
				I = sc.nextFloat();
				System.out.print("Enter a 2nd number:    ");
				D = sc.nextFloat();
				System.out.print("Enter a 3rd number:    ");
				T = sc.nextFloat();
				System.out.print("[1] - Ascending or [2] - Descending:    ");
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
			break;
			
			case 4: System.out.println("Thank you! =)");
				break;
			
			default: System.out.println("Errorororororor. ");
			break;
			}
		}while(menu!= 4);	
		}
		
	}


