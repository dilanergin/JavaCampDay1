package miniProjectFindNumber;

public class Main {

	public static void main(String[] args) {
		// verilen dizi içerisinde aranılan sayıyı bulma
		int [] numbers = new int[] {1,4,6,8,90,54,6};
		int number = 4;
		boolean isThere=false;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==number) {
				isThere=true;
			}
		}
		if(isThere == false) {
			System.out.println("üzgünüz.");
		}else {
			System.out.println("evet aradığınız sayı burada");
		}

	
	}
}
