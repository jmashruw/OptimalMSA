import java.util.ArrayList;

class InnerObject{
	private int startPos_Pi;
	private int startPos_Pj;
	
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
	private int frequency;
	private ArrayList<InnerObject> position;
	
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
	
	ArrayList<OuterObject> Nij;
	public SlidingWindow(){
		Nij = new ArrayList<>();
	}
	
	
	public void doSlidingWindow(TreeNode root_Pi, String Pj, int r) {
		int step_size = 0;
		int current_pos = 0;
		int start_pos = 0;
		int end = start_pos+ r; //start+r = end shouldn't be greater than r
		OuterObject outer_object = new OuterObject();
		
		while(current_pos < Pj.length()) {
			start_pos = current_pos;
			end = (start_pos+ r < Pj.length()) ? start_pos+r : Pj.length();
			
			while(root_Pi.getChildren().containsKey(Pj.charAt(current_pos)) && current_pos < end  ) {
				root_Pi = root_Pi.getChildren().get(Pj.charAt(current_pos));
				current_pos++;
			}
			
			
			if(current_pos == end) {
				//Case 1: Loop breaks when all the chars have matched
				//Update the entire data structure
				
				InnerObject inner_object = new InnerObject(root_Pi.getList().remove(0), start_pos);
				if(!root_Pi.isConsumed()) {
					outer_object.setFrequency(outer_object.getFrequency() + 1);
				}
				else {
					
				}
								
			}
			
			else {
				//Case 2: Partial matching -> Slide window
			}
			
			
		}
	}
	
	
}
