public class savingsBalance {

	public static void main(String[] args) {
		float sparguthaben = (float) 5000;
		int jahre = 2;
		float zinsen = (float) 0.075;
		
		for (int n = 0; n!= jahre; n++) 
		{
			sparguthaben = sparguthaben * (zinsen + 1);
		}
		
		String gerundetesSparguthaben = String.format("%.2f", sparguthaben);
		System.out.println(gerundetesSparguthaben);
	}
}
