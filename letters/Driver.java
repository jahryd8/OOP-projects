package letters;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Default Constructor: ");
        F f1 = new F();
        f1.print();

        System.out.println("\nPrimary Constructor: ");
        G g2 = new G(10, 20);
        F f2 = new F(3.14, "Test", g2);
        f2.print();

        System.out.println("\nCopy Constructor: ");
        F f3 = new F(f2);
        f3.print();
	}

}
