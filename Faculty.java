public class Faculty {

	public static void main(String[] args) {
	
		int n = 5;
		int r = 1;
		
		if(n == 0) 
		{
			System.out.println("1");
		}
		else
		{
			for (int i = 1; i < n; i++) 
			{
				r = r * (i+1);
				System.out.println(r);
			}
		}
	}
}
