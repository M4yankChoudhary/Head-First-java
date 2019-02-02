class DrumKit{
	boolean topHat = true;
	boolean snare = true;

	void playTopHate(){
		System.out.println("ding ding da-ding");
	}
	void playSnare(){
		System.out.println("bang bang ba-bang");
	}
}
class DrumKitTestDrive {
	public static void main(String[] args){
		DrumKit d = new DrumKit();
		d.playSnare();
		d.playTopHate();
		d.snare = false;

		if(d.snare == true) {
			d.playSnare();
		}
	}
}

