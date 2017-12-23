package ie.ucd.cluedo;

public class Accusation {
	
	private int suspectHypothesis;
	private int weaponHypothesis;
	private int roomHypothesis;
	
	//Need to change to get room player is in
	public Accusation(int suspectHypothesis, int weaponHypothesis, int roomHypothesis){
		
		this.suspectHypothesis = suspectHypothesis;
		this.weaponHypothesis = weaponHypothesis;
		this.roomHypothesis = roomHypothesis;
		
	}
	
	public int getSuspect(){
		return suspectHypothesis;
	}
	
	public int getWeapon(){
		return weaponHypothesis;
	}

	public int getRoom(){
		return roomHypothesis;
	}
}