package vowels;

public class Main {

	public static void main(String[] args) {
		// yazılan sesli haflerin ince mi kalın mı olduğunu bulma
		char vowel = 'ü';
		switch (vowel) {
		case 'a':
		case 'A':
		case 'o':
		case 'O':
		case 'ı':
		case 'I':
		case 'u':
		case 'U':

			System.out.println("Kalın sesli harf");
			break;

		case 'e':
		case 'E':
		case 'ü':
		case 'Ü':
		case 'ö':
		case 'Ö':
		case 'i':
		case 'İ':

			System.out.println("İnce sesli harf");
			break;
			default:
				System.out.println("Lütfen sesli harf giriniz.");

		}

	}

}
