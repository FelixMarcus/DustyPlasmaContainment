package particles;

import java.math.BigDecimal;

import particles.tests.AccelerationVector;
import structures.CartesianPosition;
import structures.ForceVector;
import structures.Vector;

public class Particle {

	private BigDecimal mass;
	private Vector position;
	private ForceVector force;

	public Particle() {
		mass = BigDecimal.ONE;
		position = new CartesianPosition(0, 0);
		force = new ForceVector(0,0);
	}

	public Particle(BigDecimal inMass, Vector inPosition) {
		this();
		mass = inMass;
		position = inPosition;
	}

	public BigDecimal mass() {
		return mass;
	}

	public Vector position() {
		return position;
	}

	public BigDecimal velocity() {
		return BigDecimal.ZERO;
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
}
