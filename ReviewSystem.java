
import java.util.*;

class movie
{
	int rating;
	String review;
	String director;
	//String actors;
	//String duration;
	 
	
	void reviews(String movie)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Your Review For this Movie : ");
	review = sc.nextLine();
	
	System.out.println("Enter the Rating For this Movie in between 0-10 : ");
	rating = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Director of this Movie : ");
	director = sc.nextLine();
	
	System.out.println("Actors of this Movie : ");
	actors = sc.nextLine();
	
	//System.out.println("Movie Duration : ");
	//duration = sc.nextLine();
	
	System.out.println("\n\tThanks for the review..!\n");
	}
	
	void display(String movie)
	{
		System.out.println("Your Review For this Movie : "+review+"\n");
		System.out.println("Your Rating For this Movie : "+rating+"\n");
		System.out.println("Director of this Movie : "+director+"\n");
		//System.out.println("Actors in this Movie : "+actors+"\n");
		//System.out.println("Movie Duration : "+duration+"\n");
	}
	
}
public class ReviewSystem
{
	public static void main(String[] args) throws Exception
	{
		System.out.print("Welcome to MyApp.com \n");
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Movie Name : "+"\n");
		String obj [] =new String[5];
		for(int i=0;i<5;i++)
		{
			System.out.print("Movie ["+i+"] : ");
			
			obj[i]=sc.nextLine();
			
		}
		/*for(String x:obj)
		{
			System.out.print(x);
		}*/
		do {
		System.out.println("Select the Movie.....!!\n Press\n\t1 For "+obj[0]+"\n\t2 For "+obj[1]+"\n\t3 For "+obj[2]+"\n\t4 For "+obj[3]+"\n\t5 For "+obj[4]);
		int i;
		i=sc.nextInt()-1;
		movie m=new movie();
		m.reviews(obj[i]);
		int choice;
		do 
		{
		System.out.println("Enter Your Choice.......\nPress : \n\t1 For Rating.....!!\n\t2 For Searching Movie.....!!\n\t3 For Exit.....!!");	
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			m.reviews(obj[i]);
			break;
			
		case 2:
			System.out.println("Enter the Movie Name : ");
			sc.nextLine();
			String movie=sc.nextLine();
			m.display(obj[i]);
		    break;
		default :
			System.out.println("Sorry You Entered Invalid Key...!!\n");
		}
		}while(choice == 1||choice == 2);
		}while(1==0||2==1||3==2||4==3||5==4);
		System.out.println("Try Again.....");
	}
}