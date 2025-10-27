public class OneTimesOneTable {
	
	public static void main(String[] args) {
		
		int z = 1;
		
		while(z <= 10) 
		{
			for (int n = 1; n <= 10; n++)
			{
				int e = z * n;
				System.out.print(e + " ");
			} 
			z++;
			System.out.println("");
		}	
	}
}
