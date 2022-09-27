package ogrenci;

public class Main {

	public static void main(String[] args) {
	
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.name = "Efsa";
		ogrenci1.schoolNumber = 284;
		ogrenci1.branch = 'A';
		
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.name = "Aybike";
		ogrenci2.schoolNumber = 306;
		ogrenci2.branch = 'C';
		
		ogrenci1.Rapor();
		ogrenci2.Rapor();
		

	}

}
