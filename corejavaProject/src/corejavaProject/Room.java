package corejavaProject;

public class Room {

	public static void main(String[] args) {

		RoomSpecifications myRoom= new RoomSpecifications();
		myRoom.length=400;
		myRoom.width=100;
		myRoom.height=200;
		int yourArea= myRoom.calculateFloorArea();
		System.out.println("Floor Area: "+ yourArea);
		

	}

}
