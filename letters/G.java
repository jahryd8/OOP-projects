package letters;

public class G {
	
	private int w;
    private static int z;

    // Default constructor
    public G() {
        this.w = 0;
        z = 0;
    }

    // Primary constructor
    public G(int wVal, int zVal) {
        this.w = wVal;
        z = zVal;
    }

    // Copy constructor
    public G(G other) {
        this.w = other.w;
        // z is static, shared across all instances
    }

    public void print() {
        System.out.println("G: w = " + w + ", z = " + z);
    }

    // Accessors and mutators (Exercise Two)
    public int getW() { return w; }
    public static int getZ() { return z; }

    public void setW(int w) { this.w = w; }
    public static void setZ(int zVal) { z = zVal; }
	

}
