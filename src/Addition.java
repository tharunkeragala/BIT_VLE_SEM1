public class Addition{

	public static void main (String args[]){

		int num1 = 10;
		int num2 = 20;
		int sum = num1 + num2;

		int sub = num1 - num2;

		int mul = num1 * num2;

		int div = num1 / num2;

		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(sum+sub+mul+div);

		//Is equal to
		System.out.println(num1 == num2);

		//Less than
		System.out.println(num1 < num2);

		//Not equal to
		System.out.println(num1 != num2);

		//Greater than
		System.out.println(num1 > num2);

		//Less than or equal
		System.out.println(num1 <= num2);
	
		//Greater than or equal
		System.out.println(num1 >= num2);

		int age =70;
		System.out.println("logical AND answer is " + (age > 18 && age < 60));

		//Brackets are considered as if condition as below
		int age1 =20;
		char status = (age1 < 40) ? 'Y' : 'N';
		System.out.println(status);			

	}
}