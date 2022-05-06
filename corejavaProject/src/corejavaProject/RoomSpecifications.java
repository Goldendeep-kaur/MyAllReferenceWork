package corejavaProject;

public class RoomSpecifications {

	int length;
	int width;
	int height;
	
	int calculateFloorArea() {
		int floorArea= length*width;
		return floorArea;
	}
	
	int calculatingPaintCost(int rate) {
		int wallArea= (2*length*height)+(2*width*height);
		int paintCost= wallArea*rate;
		return paintCost;
	}
}
