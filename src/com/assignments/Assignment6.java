package com.assignments;

public class Assignment6 {

	public static void main(String[] args) {
	//variables initialization
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		//checking the first condition, if true it will execute its statements
		if(creditScore>750)
		{
			System.out.println("Loan is approved");
		}
		/*if the above condition fails it will check this condition, if it is
		true then it will go inside to validate further conditions */
		else if ((creditScore<=750)&&(creditScore>=650))
		{
			//if the above else if is true then it will check these if conditions line by line.
			if(income>=50000)
			{
				if(isEmployed==true)
				{
					if(debtToIncomeRatio<=40)
					{
						System.out.println(customerName+ " is eligible for loan.");
					}
					else
					{
						System.out.println("Loan cannot be generated due to high debt to income ratio");
					}
				}
					else
					{
						System.out.println("Loan cannot be generated due to Unemployement");
					}
			}
					else
					{
						System.out.println("Loan cannot be generated due to low income");
						
				}
		}
		//if all the above conditions fail, then this will be printed.
		else
		{
			System.out.println("Low cannot be approved due to low credit score");
			}
			
		}
		
		
	
}


