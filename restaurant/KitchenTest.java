import java.util.Scanner;

public class KitchenTest{
	
	public static void main (String... args){
		
		//String reviewKitchen;
		
		Scanner input = new Scanner(System.in);
		
		//do
		//{ 		
			//System.out.println("Name of kitchen to be reviewed");
			System.out.println("Press 1 to review a kitchen");
			System.out.println("Press 2 to advertise a kitchen");
		
			int userReview = input.nextInt();
			
			if (userReview == 1) 
			{
			
					Kitchen reviewKitchen = new Kitchen();
				
				
					System.out.println("Please input your Kitchen Menu");
					String input1 = input.nextLine();
					
					
					double input2 = input.nextInt();
					System.out.println("Please set your food cost");
					
					System.out.printf("Rate your Kitchen cleaniness between %d%n to %d%n", 0, 10);
					int input3 = input.nextInt();
					
					reviewKitchen.setMenu(input1);
					System.out.printf("Bola\'s Kitchen Menu is %S%n", reviewKitchen.getMenu());
					
					reviewKitchen.setfoodCost(input2);
					System.out.printf("Bola\'s Cost of food per plate is %f%n",
					reviewKitchen.getfoodcost());
					
					if (input3 <= 5){
						System.out.printf("Bola\'s Kitchen is clean? %B", reviewKitchen.getClean());
					}
					else {
						reviewKitchen.isItClean(true);
						System.out.printf("Bola\'s Kitchen is clean? %B", reviewKitchen.getClean());	
					}
				}
				
			/*else
			{
					System.out.println("Other features are yet to be unlocked");
				}*/
			//}
		
		
	}

	
	
}


