package array;

public class findPrimeNot 
{

	public static void main(String[] args) 
	{
		int a[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		int i=0, j=0;
		
		for(i=0; i < a.length; i++)
		{
			//Assume the number is prime initially
			Boolean isPrime = true; 
			
			for(j=2; j <= a[i] / 2; j++)
			{
				if (a[i] % j == 0)
				{
					//If divisible, it's not prime
					isPrime= false;
					break;
				}
			}
			//Print the result directly after the loop
			System.out.println(a[i] +" - "+ (isPrime ? "Prime" : "Not Prime"));		
			}
		System.out.println();
	}
}
