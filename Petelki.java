public class Petelki {
	public static void main(String[] args) {
		int x = 1;
		System.out.println("Przed wykonaniem pętli");
		System.out.println("Wewnątrz pętli");
		while (x < 4) {
			
			System.out.println("Wartość x =" + x);
			x = x + 1;
		}
		System.out.println("I już po pętli...");
	}
}