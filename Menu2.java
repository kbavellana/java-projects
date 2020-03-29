import java.util.*;

public class Menu2 {

	static Scanner sc = new Scanner(System.in);
	static Random rn = new Random();
	
	public static void main(String args[])
	{
		int menu_resp;
		String tryagain;
		do{
			
			System.out.println("\n\t\t Menu Program \n\n\n\n\n\n1. Basketball\n 2.Color Game\n 3.Flames\n 4.Vowel Letters\n 5.Piglatin\n 6.Exit");
			System.out.println("Enter a number:");
			menu_resp = sc.nextInt();
			System.out.println("");
			
			switch(menu_resp){
			case 1: do{
				int drble, fir_scr=0, sec_scr=0, score, MVP, i, g, p;
			    int group[][] = { {0,0,0,0,0}, {0,0,0,0,0} };
			    String scrr_nm,fir_grp, sec_grp;
			    
			    
			    System.out.printf("\n\n     Scorer's name : ");
			    scrr_nm = sc.nextLine();

			    System.out.printf("\n\n \t Notice: If you want the full interface working,\n\t\t please maximize the size of this box. \n\n\t\t\t THANK YOU! =) ");
			    System.out.printf("\n\n \t Warning: This game can only accept [2] groups. \n\t\t Each group can only contain [5] members. ");

			    
			    System.out.printf("\n\n\t\t~Welcome to the Basketball pointer!~\n\n ");
			    System.out.printf("Enter 1st group's name: ");
			    fir_grp = sc.nextLine();
			    System.out.printf(" Enter 2nd group's name: ");
			    sec_grp = sc.nextLine();
			    
			    int count=10,x=1;
			    do{
			            for(drble=x;drble<=count;drble++,x++)
			            {g=0;p=0;score=0;

			            
			                System.out.printf("-------------------");
			            System.out.printf("\n|                 |");
			            System.out.printf("\n|    Dribble %d    |",drble);
			            System.out.printf("\n|                 |\n");
			                System.out.printf("-------------------");
			            
			            System.out.printf("\n---------------------------------------------------------\n");
			            System.out.printf("\n\nCurrent Scores:\t 1. %s : [%d]  \t\t\t\n  \n\t\t 2. %s : [%d]\t\t\t\n",fir_grp, fir_scr, sec_grp, sec_scr);
			            System.out.printf("\n---------------------------------------------------------\n");
			            
			            do{
			                System.out.printf("\n Team that scored[1/2]: ");
			                g = sc.nextInt();
			                 if ((g!=1 && g!=2) || (g>='a' && g<='z'))
			                    {System.out.printf("\nError.\n");}
			              }while((g!=1 && g!=2) || (g>='a' && g<='z'));
			              
			            do{
			                System.out.printf("\n Player [1-5]: ");
			                p = sc.nextInt();
			                 if((p<1 || p>5) || (p>='a' && p<='z' ))
			                    {System.out.printf("\nError.\n");}
			              }while((p<1 || p>5) || (p>='a' && p<='z' ));    
			            
			            do{
			                System.out.printf("\n Score [1-3] : ");
			                score = sc.nextInt();
			                  if((score<1 || score>3) || (score>='a' && score>='z'))
			                    {System.out.printf("\nError.\n");}
			              }while((score<1 || score>3) || (score>='a' && score>='z'));
			            
			            p--;
			            
			                 if(g==1)
			            {   g--;
			                fir_scr+=score;
			                group[g] [p]+=score;
			            }
			            else if(g==2)
			            {   g--;
			                sec_scr+=score;
			                group[g] [p]+=score;
			            }
			            
			        }
			        if (fir_scr==sec_scr)
			        {count=count+3; System.out.printf("\n\n\n\nOOPS! WE HAVE A TIE BREAKER! ^_^\n\n\n");}
			    }while(fir_scr==sec_scr);   
			    
			    System.out.printf("\n--------------\n");
			      System.out.printf("\nFinal Results\n");
			    System.out.printf("\n--------------\n");
			    
			    System.out.printf("\n\t %s : %d \t\t\t\t %s: %d ",fir_grp, fir_scr, sec_grp, sec_scr);
			    System.out.printf("\n\n\n Individual Scores : \n\n");
			    System.out.printf("\t %s \t\t\t %s",fir_grp,sec_grp);
			    
			      for(i=1,p=0;p<5 && i<=5;p++)
			        {   System.out.printf(" \n\n\tplayer %d : %d \t\t\t player %d : %d",i,group[0] [p],i,group[1] [p]);   
			            i++;
			        }
			    
			    if(fir_scr>sec_scr)
			    System.out.printf("\n\n OUR WINNING TEAM is : %s! Congratulations!",fir_grp);
			    else
			    System.out.printf("\n\n OUR WINNING TEAM is : %s! Congratulations!",sec_grp);
			    
			    
			    MVP=0;
			    
			    for(g=0;g<2;g++ )
			    {
			        for(p=0; p<5;p++ )
			            if(MVP<=group[g][p])
			            MVP=group[g][p];
			    }
			    System.out.printf("\n\n\nOur MOST VALUABLE PLAYER/s : ");
			    g=0;
			    do{p=0;
			    do{
			        if (group[g][p] != 0)
			            if(MVP==group[g][p])
			            {i=p+1;
			        
			    if (g==0)
			        System.out.printf("\n\n Player %d of %s!! with score of %d points. \n CONGRATULATIONS!",i,fir_grp,MVP);
			    else if (g==1)
			        System.out.printf("\n\n Player %d of %s!! with score of %d points. \n CONGRATULATIONS!",i,sec_grp,MVP);
			                
			            }
			    else;
			        p++;
			    }while( p<5);
			    g++;
			    }while(g<2);         
			    
				
				System.out.println("Try Again? [y/n]: "); tryagain = sc.nextLine();
				
			
			}while(tryagain == "y" || tryagain == "Y");
			
			break;
			
			case 2: do{
				
				String color[] = {"red","green","blue","orange","white","yellow"};
				float bet,win_amount=0;
				int answer[]={0,0,0},i,choose_color,win=0;
				
				
				System.out.println("Choose a color \n \n 1. red\n 2. green \n 3. blue \n 4. orange \n 5. white \n 6. yellow\n\tcolor: ");
				choose_color=sc.nextInt()-1;
				System.out.println("Enter amount of bet");
				bet = sc.nextFloat();
				
				for(i=0;i<3;i++)
				{	
					answer[i] = rn.nextInt(6);
				}
				for(i=0;i<3;i++)
				{
					if(answer[i]==choose_color)
					{
						win++;
					}
				}
				System.out.printf("The Colors Are: %s, %s %s",color[answer[0]],color[answer[1]], color[answer[2]]);
				if(win>1)
					win_amount = bet*(win+1);
				if(win>0)
				System.out.println("\n\nCongratulations! you win" + win + "time/s!\n you won a total amount of:" + win_amount);
				else
					System.out.println("\n\nSorry,try again next time.");
				
				
				
				
				
				System.out.println("Try Again? [y/n]: "); tryagain = sc.nextLine();
				
			
			}while(tryagain == "y" || tryagain == "Y");
			
			break;
			
			
			case 3: do{
				
			String name1, name2;
			System.out.println("Enter the first name: ");
			name1 = sc.nextLine();
			System.out.println("Eneter the second name:");
			name2 = sc.nextLine();
			name1 = name1.trim();
			name2 = name2.trim();
			
			System.out.println(name1.toUpperCase()+" and "+name2.toUpperCase());
			name1 = name1.toLowerCase();
			name2 = name2.toLowerCase();
			String name1_split[] = name1.split("");
			String name2_split[] = name2.split("");
			name1 = "";
			name2 = "";
			
			for(int i=0; i<name1_split.length; i++) {
				
				name1= name1+name1_split[i];
			}
			
			for(int i=0; i<name1_split.length; i++) {
				
				name2= name2+name2_split[i];
			}
					
			int length = name1.length()+name2.length();
			boolean name_check[] = new boolean[name2.length()];
			
			for(int i=0; i<name2.length(); i++) {
				
				name_check[i]=false;
			}
			
			for(int i=0; i<name1.length(); i++) {
				
				for(int j=0; j<name2.length();j++) {
					
					if((name_check[j]==false) && (name1.charAt(i) == name2.charAt(j))) {
						
						name_check[j]=true;
						length=length-2;
						break;
					}
				}
			}
				boolean flames_check[] = new boolean[6];
				for(int i=0;i<6;i++) {
					
					flames_check[i]=true;
				}
				
				int count=6;
				int k=1, deleted_letters=0;
				int j;
				
				for(j=0; j<=count; j++) {
					
					if(k<=length) {
						
						if(j == count) {
							
							j=0;
						}
						if(flames_check[j] == true) {
							
							k=k+1;
						}
					}
					if((k-1)==length) {
						
						deleted_letters = deleted_letters+1;
						flames_check[j] = false;
						k=1;
					}
					if(deleted_letters==6){
						
						if(j==0) {
							System.out.println(" are good FRIENDS");
						}
						else if(j==1) {
							System.out.println(" are LOVERS");
						}
						else if(j==2) {
							System.out.println(" have lots of ANGRRY");
						}
						else if(j==3) {
							System.out.println(" are going to get MARRIED");
						}
						else if(j==4) {
							System.out.println(" are ENEMIES");
						}
						else if(j==5) {
							System.out.println(" are SWEETHEART");
						}
						break;
					}
				} 
				
				System.out.println("Try Again? [y/n]: "); tryagain = sc.nextLine();
				
			
			}while(tryagain == "y" || tryagain == "Y");
			
			break;
			
			
			case 4: do{
				
				
				String word = null;
				Scanner sc = new Scanner(System.in);
				//StringBuilder word= new StringBuilder();
				System.out.println("Enter your word: ");
				word = sc.nextLine();
				
				System.out.println("asfasf    " + word);
				
				for(int i= 0; i<word.length(); i++) {
					
					if(word.charAt(i) == 'a') {
						System.out.println("Index of a " + i);
						char [] temp = word.toCharArray();
						temp[i] = '!';
						word = String.valueOf(temp);
					}
					
					else if(word.charAt(i) == 'e') {
						System.out.println("Index of e " + i);
						char[] temp = word.toCharArray();
						temp[i] = '@';
						word = String.valueOf(temp);
					}
					
					else if(word.charAt(i) == 'i') {
						System.out.println("Index of i " + i);
						char[] temp = word.toCharArray();
						temp[i] = '#';
						word = String.valueOf(temp);
					}
					
					else if(word.charAt(i) == 'o') {
						System.out.println("Index of o " + i);
						char[] temp = word.toCharArray();
						temp[i] = '$';
						word = String.valueOf(temp);
						
					}
					
					else if(word.charAt(i) == 'u') {
						System.out.println("Index of u " + i);
						char[] temp = word.toCharArray();
						temp[i] = '%';
						word = String.valueOf(temp);
					}
				}
				
				
				System.out.println("New " + word);
				
				System.out.println("Try Again? [y/n]: "); tryagain = sc.nextLine();
				
			
			}while(tryagain == "y" || tryagain == "Y");
			
			break;
			
			
			case 5: do{
				
				String word;
			    int len,i=0;
			    char last;
			    char nword[] = new char[80];
			    System.out.printf("Enter word:");
			    word = sc.nextLine();
			    len=word.length();
			    last = word.charAt(len-1);
			    for(i=0;i<len-1;i++)
			    {
			    	nword[i] = word.charAt(i);
			    }
			    System.out.printf("after:\n a%c%s",last,String.valueOf(nword));
				
				System.out.println("Try Again? [y/n]: "); tryagain = sc.nextLine();
				
			
			}while(tryagain == "y" || tryagain == "Y");
			
			break;
			
			default: break;
			
			}
		}while(menu_resp!= 6);
		
		System.out.println("Thank you! =)");
		
	}
}
