public class StarSteps {
	
	public static void main(String[] args) {
		
		int h = 10, b = 10;
		int stars_start = b;
		
		while (h > 0) {
			for (int l = (b*h)-b; l > 0; l--) 
			{
				System.out.print("-");
			}
			for (int s = 1; s <= stars_start; s++ ) 
			{
				System.out.print("*");
			}
			stars_start += b;
			h--;
			System.out.println("");
		}
	}
}
