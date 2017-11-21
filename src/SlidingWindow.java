import java.util.ArrayList;

class InnerObject{
	int startPos_Pi;
	int startPos_Pj;
	
	public InnerObject(int startPos_Pi, int startPos_Pj) {
		this.startPos_Pi = startPos_Pi;
		this.startPos_Pj = startPos_Pj;
	}
	
	public int getStartPos_Pi() {
		return startPos_Pi;
	}
	public void setStartPos_Pi(int startPos_Pi) {
		this.startPos_Pi = startPos_Pi;
	}
	public int getStartPos_pj() {
		return startPos_Pj;
	}
	public void setStartPos_pj(int startPos_pj) {
		this.startPos_Pj = startPos_pj;
	}
	
}

class OuterObject{
	int frequency;
	ArrayList<InnerObject> position;
	
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public ArrayList<InnerObject> getPosition() {
		return position;
	}
	public void setPosition(ArrayList<InnerObject> position) {
		this.position = position;
	}
	
}



public class SlidingWindow {

}
