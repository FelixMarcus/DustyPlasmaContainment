package structures;

import java.math.BigDecimal;

public class VelocityVector extends Vector {

	public VelocityVector(BigDecimal x, BigDecimal y) {
		super(x, y);
	}

	public VelocityVector(double x, double y) {
		super(x, y);
	}

	public VelocityVector accelerate(AccelerationVector acceleration,
			BigDecimal testTime) {

		BigDecimal vx = this.xcoord.add(acceleration.x().multiply(testTime));
		BigDecimal vy = this.ycoord.add(acceleration.y().multiply(testTime));
		
		return new VelocityVector(vx, vy);
	}
}
