
public class Hesaplama {
	public int Toplama(int sayi1, int sayi2) {
		return sayi1 + sayi2;

	}

	public int Cikarma(int sayi1, int sayi2) {
		if (sayi1 > sayi2) {
			return sayi1 - sayi2;
		} else {
			return sayi2 - sayi1;
		}
	}

	public int Carpma(int sayi1, int sayi2) {
		return sayi1 * sayi2;

	}

	public int Bolme(int sayi1, int sayi2) {
		return sayi1 / sayi2;

	}

}
