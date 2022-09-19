package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		//verilen sayının asal olup olmadığını bulma
		int number = -98;
		boolean isPrime = true;
		if(number<=1) {
			System.out.println("En küçük asal sayı 2'dir.Lütfen geçerli bir sayı giriniz.");
			return;
		}
		
		for(int i=2; i<number; i++) {
			if(number % i ==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("sayı asaldır");
		}else {
			System.out.println("sayı asal değildir.");
		}
	}

}
