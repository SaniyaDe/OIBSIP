package com.pack;

import java.util.Scanner;

public class Random1 {
	Scanner s=new Scanner(System.in);
	
	public static int min;
	public static int max;

	public Random1(int min,int max)
	{
		this.min=min;
		this.max=max;
	}
		
	int Generate_ran()
	{
		int guess_num=(int)(Math.random()*(max-min+1)+min);
		return guess_num;
	}
	

	void Check_con()
	{
		int score=0;
		char ans;
		do
		{
			int guess_num=Generate_ran();
			for(int i=0;i<=10;i++)
			{
				System.out.println("Enter the number:");
				Scanner s=new Scanner(System.in);
				int num=s.nextInt();
				
				if(guess_num>=min && guess_num<=max && i<=10)
				{
					if(guess_num==num)
					{
						System.out.println("Entered number is guessed correctly");
						score++;
						System.out.println("Your score is:"+score);
						break;
					}
					else if(guess_num>num)
					{
						System.out.println("Try to enter a higher number");
						
					}
					else
					{
						System.out.println("Try to enter a smaller number");
						
					}
				}
				else
				{
					System.out.println("Enter the number within the given range");
					break;
				}
				if(i==10)
				{
					System.out.println("You have exhausted 10 trials.");
					System.out.println("The answer is:"+guess_num);
					System.out.println("Your score is:"+score);
				}
			}
			
			System.out.println("Do you wish to play again?");
			ans=s.next().charAt(0);
		}
		while(ans=='y'||ans=='Y');
		System.out.println("Thank you for playing this game.");
	}
	
	public static void main(String[] args) {
		
		Random1 r=new Random1(1,100);
		
		r.Check_con();
	
	}
}
