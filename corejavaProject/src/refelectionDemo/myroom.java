package refelectionDemo;



public class myroom {

 private int length;
 private int width;
 private int height;
 private String color;
 private int roomNo;
public myroom() {
	
}
public myroom(int length, int width, int height, String color, int roomNo) {
	super();
	this.length = length;
	this.width = width;
	this.height = height;
	this.color = color;
	this.roomNo = roomNo;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeight() {
	return height;
}
public void setHeigh(int height) {
	this.height = height;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getRoomNo() {
	return roomNo;
}
public void setRoomNo(int roomNo) {
	this.roomNo = roomNo;
}
 
	int calculateFloorArea() {
		int floorArea=length*width;
		return floorArea;
	}
	
	int calculatePaintingCost(int rate) {
		int walArea=(2*length*height)+(2*width*height);
		int paintingCost= walArea*rate;
		return paintingCost;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + height;
		result = prime * result + length;
		result = prime * result + roomNo;
		result = prime * result + width;
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
		myroom other = (myroom) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (height != other.height)
			return false;
		if (length != other.length)
			return false;
		if (roomNo != other.roomNo)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "myroom [length=" + length + ", width=" + width + ", height=" + height + ", color=" + color + ", roomNo="
				+ roomNo + "]";
	}
	
}
