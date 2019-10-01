
public class Pen {
	
	String type;
	float cost;
	String brand;
	
	public Pen(String type, float cost, String brand) {
		
		this.type = type;
		this.cost = cost;
		this.brand = brand;
	}
	
	//alt_shift+
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Pen other = (Pen) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[Type:"+type+",Cost:"+cost+",Brand:"+brand+"]";
		
	}
	
	
	
	

}
