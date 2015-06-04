package structures;

import java.math.BigDecimal;

public class CartesianPosition {

	private BigDecimal xcoord;
	private BigDecimal ycoord;

	public CartesianPosition(BigDecimal x, BigDecimal y) {
		xcoord = x;
		ycoord = y;
	}

	public CartesianPosition(double x, double y) {
		new CartesianPosition(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
	}

	public BigDecimal x() {
		return xcoord;
	}

	public BigDecimal y() {
		return ycoord;
	}

	public void moveBy(CartesianPosition vector) {
		xcoord.add(vector.x());
		ycoord.add(vector.y());
	}

}
