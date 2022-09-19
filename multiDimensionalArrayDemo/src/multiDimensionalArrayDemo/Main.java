package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		// çok boyutlu dizileri anlamak
		String[][] ogrenciler = new String[4][3];

		ogrenciler[0][0] = "dilan";
		ogrenciler[0][1] = "emre";
		ogrenciler[0][2] = "ılgın";
		ogrenciler[1][0] = "songül";
		ogrenciler[1][1] = "emin";
		ogrenciler[1][2] = "naz";
		ogrenciler[2][0] = "zeynep";
		ogrenciler[2][1] = "aleyna";
		ogrenciler[2][2] = "çağla";
		ogrenciler[3][0] = "serdar";
		ogrenciler[3][1] = "kıvanç";
		ogrenciler[3][2] = "melih";
		
		for(int i=0; i<4; i++) {
			System.out.println("************");
			for(int j=0; j<3; j++) {
				System.out.println(ogrenciler[i][j]);
			}
		}

	}

}
