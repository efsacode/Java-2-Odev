
public class Main {

	public static void main(String[] args) {
		Hesaplama hesapMakinesi = new Hesaplama();
		
		double sonuc1 = hesapMakinesi.Bolme(12, 6);
		double sonuc2 = hesapMakinesi.Carpma(3, 9);
		double sonuc3 = hesapMakinesi.Cikarma(4, 25);
		double sonuc4 = hesapMakinesi.Toplama(155, 457);
		
		System.out.println("Bolmenin sonucu: " +sonuc1 +"\n" 
				+"Carpmanin sonucu: " +sonuc2 +"\n" 
				+ "Cikarmanin sonucu: " +sonuc3 +"\n"
				+ "Toplamanin sonucu: " +sonuc4 +"\n");	
	}
}
