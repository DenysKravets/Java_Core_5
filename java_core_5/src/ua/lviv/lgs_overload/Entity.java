package ua.lviv.lgs_overload;

public class Entity 
{
	private double x;
	private double y;
	private double z;
	private double velocity;
	
	Entity(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	Entity(double x, double y, double z, double velocity)
	{
		this(x, y, z);
		this.velocity = velocity;
	}

	@Override
	public String toString() {
		return "Entity [x=" + x + ", y=" + y + ", z=" + z + ", velocity=" + velocity + "]";
	}
	
}
