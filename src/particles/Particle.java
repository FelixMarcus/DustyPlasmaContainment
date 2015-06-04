package particles;

import java.math.BigDecimal;

import structures.AccelerationVector;
import structures.CartesianPosition;
import structures.ForceVector;
import structures.Vector;
import structures.VelocityVector;

public class Particle {

	private BigDecimal mass;
	private CartesianPosition position;
	private ForceVector force;
	private VelocityVector velocity;

	public Particle() {
		mass = BigDecimal.ONE;
		position = new CartesianPosition(0, 0);
		force = new ForceVector(0,0);
		velocity = new VelocityVector(0,0);
	}

	public Particle(BigDecimal inMass, CartesianPosition inPosition) {
		this();
		mass = inMass;
		position = inPosition;
	}

	public BigDecimal mass() {
		return mass;
	}

	public CartesianPosition position() {
		return position;
	}

	public VelocityVector velocity() {
		return velocity;
	}

	public BigDecimal charge() {
		return BigDecimal.ZERO;
	}

	public ForceVector forces() {
		return force;
	}

	public AccelerationVector acceleration() {
		return force.getAcceleration(mass);
	}

	public void setMass(BigDecimal inMass) {
		mass = inMass;
	}

	public void addForce(ForceVector inForce) {
		force.add(inForce);
	}

	public void increaseVelocityFor(BigDecimal testTime) {
		 velocity = velocity.accelerate(acceleration(), testTime);
	}

	public void moveFor(BigDecimal testTime) {
		
		BigDecimal xmove = velocity.x().multiply(testTime).multiply(BigDecimal.valueOf(0.5));
		BigDecimal ymove = velocity.y().multiply(testTime).multiply(BigDecimal.valueOf(0.5));
		CartesianPosition moveBy = new CartesianPosition(xmove, ymove);
			
		position.moveBy(moveBy);
	}
}
