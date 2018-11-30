package zoolGame;

public class Tile extends Grid {
	
	
	public String greyTile(int xCord, int yCord) {
		int position = xCord / yCord;
		if(position < 9 && position > 4) {
			return "You See nothing but grey swampland";
		} else {
			return "There is soething in the distance you can't quite make out";
		}
	}

}
