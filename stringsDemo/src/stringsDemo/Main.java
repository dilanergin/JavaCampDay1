package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Ben bunu başaracağım!";
		System.out.println(mesaj);
		System.out.println("Mesajı eleman sayısı : "+mesaj.length());
		System.out.println("Mesajın 8. elemanı : "+mesaj.charAt(7));
		System.out.println(mesaj.concat("Bugün başladım bile."));
		System.out.println(mesaj.startsWith("y"));
		System.out.println(mesaj.endsWith("!"));
		System.out.println(mesaj.indexOf("u"));
		System.out.println(mesaj.lastIndexOf("u"));
		System.out.println(mesaj.replace(' ','*'));
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		
	}

}
