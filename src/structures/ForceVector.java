package structures;

import java.math.BigDecimal;

import particles.tests.AccelerationVector;

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

	public AccelerationVector getAcceleration(BigDecimal mass) {
		return new AccelerationVector(xcoord.divide(mass), ycoord.divide(mass));
	} 
}