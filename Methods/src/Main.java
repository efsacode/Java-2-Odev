
public class Main {

	public static void main(String[] args) {
		int result;
		result = sum(1,5);
		System.out.println(result);

	}
	public static int sum(int first, int end) {
		if(end>first) {
		return end + sum(first, end-1);
		}
		else {
			return end;
		}
	}

}
