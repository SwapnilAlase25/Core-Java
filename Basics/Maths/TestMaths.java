package TestMaths;

public class TestMaths {


	
	public void  power(int base,int index)
	{
		int res=1;
		while(index!=0)
		{
			res=res*base;
			index--;
		}
		System.out.println(" power is " + res);
	}
	
	public void FindFactorial(int number)
	{
			int res=1;
			while(number!=0)
			{
				res=res*number;
				number--;
			}
			System.out.println(" Factorial is " + res);
		
	}
	
	public void findTable(int number)
	{
		int i=0,res=0;
		while((i++)!=10)
		{
			res=res+number;
			System.out.println(number + "x" + i + "=" +  res);
			
		}
	}
	
	public void findPrime(int number)
	{
		int count=0;
		
		for(int i=1;i<=(number/2);i++)
		{
			if(number%i==0)
			{
				count++;
			}
			
		}
		if(count==1)
		{
			System.out.println(number + " is Prime");
		}
		else
		{
			System.out.println(number + " is not Prime");
		}
		
		
	}
	
}