public class Ifclass{
	public static void main(String args[]){
		int month = 4; //April
		String season;
		
		if(month ==12 || month ==1 || month==2)
			season = "Winter";
		else if (month==3 || month==4|| month==5)
			season = "Spring";
		else if (month==6 || month==7|| month==8)
			season = "Summer";
		else if (month==9 || month==10|| month==11)
			season = "Autum";
		else 
			season = "Bogus Month";
		
		System.out.println("April is in the " + season + ".");
		
		
		/*for (int i=0; 1 < 6; i++)
			switch(i) {
				case 0:
				System.out.println("i is zero");
				break;
				case 1:
				System.out.println("i is one");
				break;
				case 2:
				System.out.println("i is two");
				break;
				case 3:
				System.out.println("i is three");
				break;
				default:
				System.out.println("i is greter than 3");
				
			}*/
			
//		int sum = 0;
//		for (int i=0;i<10;i=i+1)
//		{
//			sum = sum + i;
//		}
//
//		System.out.println(sum);
//
//
//		int sum1 = 0;
//		int i = 0;
//		while (i < 100)
//		{
//			sum1 = sum1 + 1;
//			i = i +1;
//			System.out.println(sum1);
//		}
//
//
//		String names[]={"Kandy","Dubai"};
//System.out.print(names);
		
		
	}
}