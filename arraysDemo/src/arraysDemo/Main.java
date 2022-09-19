package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "dilan";
		String ogrenci2 = "emre";
		String ogrenci3 = "ılgın";
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println("-----------------");

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "dilan";
		ogrenciler[1] = "emre";
		ogrenciler[2] = "ılgın";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-----------------");

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
