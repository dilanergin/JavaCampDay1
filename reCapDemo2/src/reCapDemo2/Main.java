package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		/*
		 * dizileri kullnarak dizi içindeki elemanları yazdır, topla ve en büyük sayıyı
		 * bul
		 */

		double[] myList = { 5.7, 4.6, 1.2, 99.7, 6.7 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam : " + total);
		System.out.println("Dizideki en büyük sayı: " + max);
	}

}
