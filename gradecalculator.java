package gradecalculator;

import java.util.Scanner;

public class gradecalculator {
	public static void main (String [] args) {
			System.out.print("press 1 if you are an international transfer student \n press 2 if you are a domestic transfer student \n press 3 if you are not a transfer student");
			Scanner input = new Scanner(System.in);
			int c = input.nextInt();
			double gpa = 0, iscore = 0,wscore = 0,gscore = 0,pscore = 0;
			int i = 0;
			
			System.out.println("Enter your type of GPA (1 for over-four, or 2 for over-ten):");
			int cgpa = 0;
			while(i!=1) {
				cgpa= input.nextInt();
				if(cgpa==1 ||cgpa == 2) {
					i=1;
					continue;
				}
				System.out.println("Please enter a valid number");
			}
			i=0;
			System.out.println("Please insert your GPA");
			while(i!=1) {
				if(cgpa==1) {
					while(i!=1) {
						gpa=input.nextDouble();
						if(0<=gpa && gpa<=4) {
							i=1;
						}else {
						System.out.println("Please enter a valid number");
						}
					}
					i=1;
					continue;
				}
				if(cgpa==2) {
					while(i!=1) {
						gpa=input.nextDouble();
						if(0<=gpa && gpa<=10) {
							gpa=gpa/2.5;
							i=1;
							continue;
						}
						System.out.println("Please enter a valid number");
					}
					i=1;
					continue;
				}
			}
			i=0;
			
			double ascore = 1;
			if ( c == 1) {
				if(gpa<3) {
					System.out.println("Your application is rejected");
					System.exit(0);
				}
				System.out.println("Enter your GRE/GMAT score:");
				while (i!=1) {
				    gscore = input.nextDouble();
				 	if (0 <= gscore && gscore <= 800) {
				 		i = 1;
				 		continue;
				 	}
				 	System.out.println("Please enter a valid number");	
				 		
				 	}
				i=0;
				if (gscore <700 ){
					System.out.println("Your application is rejected!");
					System.exit(0);
				}
				
				System.out.println("Enter your IELTS score:");
				while (i!=1) {
					iscore = input.nextDouble();
					if ( 0 <= iscore && iscore <= 10 ) {
						i = 1 ;
						continue;
						}
					System.out.println("Please enter a valid number.");
				} 
				i=0;
				
				if (iscore< 6.5) {
					System.out.println("Your application is rejected!");
					System.exit((int) iscore);
					iscore = 0 ;
					}
				else {
					iscore = 1 ;
				}
				ascore = 80+ (gscore - 700)/5 ;
				 
				System.out.println(" Enter your written exam score:");
				while (i!= 1) {
					wscore= input.nextInt();
					if (0<= wscore && wscore<=100) {
						i =1;
					    continue;
					}
					System.out.println("Please enter a valid number.");
				}
				i=0 ;
				if (wscore<50){
					System.out.println(" Your application is rejected!");
				    System.exit(0);
				}
				
			}
			
			if(c==2){
				if(gpa<3) {
					System.out.println("Your application is rejected");
					System.exit(0);
				}
				System.out.println("What is your language exam type? \n press 1 for GRE/GMAT \n press 2 for ALES");
				int e = input.nextInt();
				while (i!=1) {
					if (e==1 ) {
						System.out.println("Enter your GRE/GMAT score:");
						while (i!=1) {
						    gscore = input.nextDouble();
						 	if (0 <= gscore && gscore <= 800) {
						 		i = 1;
						 		continue;
						 	}
						 	System.out.println("Please enter a valid number");	
						 		
						 	}
						i=0;
						if (gscore <700 ){
							System.out.println("Your application is rejected!");
							System.exit(0);
						}
						ascore = 80+ (gscore - 700)/5 ;
					}
				
					if ( e==2) 	{
						System.out.println("Enter your ALES score:");
						while (i!=1) {
						    ascore = input.nextInt();
						 	if (0 <= ascore && ascore <= 100) {
						 		i = 1;
						 		continue;
						 	}
						 	System.out.println("Please enter a valid number");		
						}
						i=0;
						if (ascore <80 ){
							System.out.println("Your application is rejected!");
							System.exit(0);
						}
							
						System.out.println(" Enter your written exam score:");
						while (i!= 1) {
							wscore= input.nextInt();
							if (0<=wscore && wscore<=100) {
								i =1;
							    continue;
							}
							System.out.println("Please enter a valid number.");
						}
						i=0 ;
						if (wscore<50){
							System.out.println(" Your application is rejected!");
						    System.exit(0);
				 		
						}
			
					}
				}
				i=0;
				System.out.println("Please ebter your proficiency exam score");
				while (i!=1) {
				    pscore = input.nextInt();
				 	if (0 <= pscore && pscore <= 100) {
				 		i = 1;
				 		continue;
				 	}
				 	System.out.println("Please enter a valid number");		
				}
				if(pscore<5) {
					System.out.println(" Your application is rejected!");
					System.exit(0);
				}
				i=0;
			
			}
			    if (c==3) {
			    	System.out.println("Enter your IELTS score:");
			    	while (i!=1) {
			    		iscore = input.nextDouble();
			    		if ( 0 <= iscore && iscore <= 10 ) {
			    			i = 1 ;
			    			continue;
							}
			    		System.out.println("Please enter a valid number.");
			    	} 
			    	i=0;
			    	if (iscore< 6.5) {
			    		System.out.println("Your application is rejected!");
			    		System.exit((int) iscore);
			    		iscore = 0 ;
					}
			    	int sois;
					System.out.println("Enter your Statement of Interest score:");
					sois =input.nextInt();
					while (i!=1) {
						iscore = input.nextDouble();
						if ( 0 <= sois && sois <= 10 ) {
							i = 1 ;
							continue;
							}
						System.out.println("Please enter a valid number.");
					} 
					i=0;
				
					double fscoret = (gpa/4)*0.4 + (sois/10)*0.3 + (iscore/10)*0.3 ;
			    	System.out.println("Your final score is" + fscoret);
			    
			    
					}
		
			    
			if(c==1 && c==2) {
				double fscore = gpa/2.5 + ascore/125 + wscore/62.5;
				System.out.println(" Your final score is" + fscore);
			}
}
}