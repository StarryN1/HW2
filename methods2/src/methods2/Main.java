package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(sehirVer());
		
		int sayi = topla(51, 7);
		System.out.println(sayi);
	int toplam=topla2(2,3,4,5,6,7,8);
	System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}
	
	public static int topla2( int... sayilar){
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
