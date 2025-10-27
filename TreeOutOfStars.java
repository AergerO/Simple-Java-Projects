public class Tree {

	public static void main(String[] args) {
		int stars = 8;

		int h = (stars / 2) + 1;
		int space = h-1;
		int s = 1;
		
		//!Even number of stars get + 1 otherwise the tree will look ugly
	
		while (h != 0) 
		{	
				for (int n = 0; space != n; n++) 
				{
					System.out.print("-");
				}
				
				for (int l = 0; s != l; l++) 
				{
					System.out.print("*");
				}
			System.out.println("");
			space -= 1;
			s += 2;
			h--;
		}
	}
}
