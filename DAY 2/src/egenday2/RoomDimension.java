package egenday2;

public class RoomDimension {

	public RoomDimension(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	int length;
	int width;

	public int area() {
		return this.length * this.width;

	}

}

