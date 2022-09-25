package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayılar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 24;
		boolean varMı = false;

		for (int sayı : sayılar) {
			if (aranacak == sayı) {
				varMı = true;
				break;
			}

		}

		if (varMı) {
			mesajVer(aranacak);
		} else {
			System.out.println(" sayıların bir elemanı değildir:" + aranacak);
		}
	}
	public static void mesajVer(int aranacak) {
		System.out.println( " sayıların bir elemanıdır: " + aranacak);
	}
	
}
