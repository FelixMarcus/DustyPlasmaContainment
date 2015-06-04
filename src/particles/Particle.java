package particles;

import java.math.BigDecimal;

import structures.CartesianPosition;

public class Particle {

	private BigDecimal mass;
	private CartesianPosition position;

	public Particle(BigDecimal inMass, CartesianPosition inPosition) {
		mass = inMass;
		position = inPosition;
	}

	public Particle() {
		mass = BigDecimal.ONE;
		position = new CartesianPosition(0, 0);
	}

	public BigDecimal mass() {
		return mass;
	}

	public CartesianPosition position() {
		return position;
	}

	public BigDecimal velocity() {
		return BigDecimal.ZERO;
	}

	public BigDecimal charge() {
		return BigDecimal.ZERO;
	}

	public BigDecimal forces() {
		return BigDecimal.ZERO;
	}

	public BigDecimal acceleration() {
		return BigDecimal.ZERO;
	}

	public void setMass(BigDecimal inMass) {
		mass = inMass;
	}
	
}
