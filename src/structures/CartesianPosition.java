package structures;

import java.math.BigDecimal;

public class CartesianPosition extends Vector {

	public CartesianPosition(BigDecimal x, BigDecimal y) {
		super(x,y);
	}

	public CartesianPosition(double x, double y) {
		super(x,y);
	}

	public void moveBy(CartesianPosition inVector) {
		append(inVector);
	}
}
