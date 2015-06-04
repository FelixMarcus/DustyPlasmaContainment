package structures;

import java.math.BigDecimal;

public abstract class Vector {

	protected BigDecimal xcoord;
	protected BigDecimal ycoord;

	public Vector(BigDecimal x, BigDecimal y) {
		xcoord = x;
		ycoord = y;
	}
	
	public Vector(double x, double y) {
		this(BigDecimal.valueOf(x), BigDecimal.valueOf(y));
	}

	public BigDecimal x() {
		return xcoord;
	}

	public BigDecimal y() {
		return ycoord;
	}
	
	protected void append(Vector inVector){
		xcoord = this.xcoord.add(inVector.x());
		ycoord = this.ycoord.add(inVector.y());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((xcoord == null) ? 0 : xcoord.hashCode());
		result = prime * result + ((ycoord == null) ? 0 : ycoord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector other = (Vector) obj;
		if (xcoord == null) {
			if (other.xcoord != null)
				return false;
		} else if (!xcoord.equals(other.xcoord))
			return false;
		if (ycoord == null) {
			if (other.ycoord != null)
				return false;
		} else if (!ycoord.equals(other.ycoord))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "(" + xcoord + ", " + ycoord + ")";
	}

	
}
