package letters;

public class F {

	    private double x;
	    private String y;
	    private G g;  // Composition

	    // Default constructor
	    public F() {
	        this.x = 0.0;
	        this.y = "";
	        this.g = new G();
	    }

	    // Primary constructor
	    public F(double x, String y, G gObj) {
	        this.x = x;
	        this.y = y;
	        this.g = new G(gObj); // deep copy
	    }

	    // Copy constructor
	    public F(F other) {
	        this.x = other.x;
	        this.y = other.y;
	        this.g = new G(other.g); // deep copy
	    }

	    public void print() {
	        System.out.println("F: x = " + x + ", y = " + y);
	        g.print();
	    }

	    // Accessors and mutators (Exercise Two)
	    public double getX() { 
	    	return x; 
	    	}
	    public String getY() { 
	    	return y; 
	    	}
	    public G getG() {
	    	return g;
	    	}

	    public void setX(double x) { 
	    	this.x = x; 
	    	}
	    public void setY(String y) { 
	    	this.y = y; 
	    	}
	    public void setG(G gObj) {
	    	this.g = new G(gObj);
	    	}


}
