package perfectNumber;

public class Main {

	public static void main(String[] args) {
		// kendisini bölen sayıların toplamı kendisine eşit olan sayılara mükemmel sayı
		// denir.Verilen sayının mükemmel sayı olup olmadığını bulalım.
		int number = 90;
		int total = 0;
		boolean isDivite = false;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				isDivite = true;
				if(isDivite) {
					total=total+i;
					
				}
			}
			
		}
		if(total == number) {
			System.out.println("Perfect number!");
		}else {
			System.out.println("Not perfect.Sorry");
		}
	}

}
