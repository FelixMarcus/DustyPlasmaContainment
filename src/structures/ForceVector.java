package structures;

import java.math.BigDecimal;

public class ForceVector extends Vector {

	public ForceVector(BigDecimal x, BigDecimal y) {
		super(x, y);
	}
	
	public ForceVector(double x, double y) {
		super(x, y);
	}

	public void add(ForceVector inForce) {
		append(inForce);
	} 
}