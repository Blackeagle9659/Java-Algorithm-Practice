

public class PrimeNumber {
	public static void main(String[] args) {
		
	
		
		for (int number = 2; number < 100; number++) {
			
			boolean isPrime = true;
			for (int divisor = 2; divisor < number; divisor++) {
				
					if (number % divisor == 0) {
						isPrime= false;
						break;

				}}
					if(isPrime==true) {
						System.out.println(number);}
		
		
		
	}
}
}
