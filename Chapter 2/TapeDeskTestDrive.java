class TapeDesk {
	boolean canRecord = false;
	
	void playTape(){
		System.out.println("Tape Playing");
	}
	void recordTape(){
		System.out.println("Tape Recording");
	}

}

class TapeDeskTestDrive{
	public static void main(String[] args){
		TapeDesk t = new TapeDesk();
		t.canRecord = true;
		t.playTape();

		if(t.canRecord == true) {
			t.recordTape();
		}
	}
}


