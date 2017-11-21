import java.util.HashMap;

public class TreeNode{
	private char c;
	private HashMap<Character, TreeNode> children;  
	private boolean isLeaf;
	
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public HashMap<Character, TreeNode> getChildren() {
		return children;
	}
	public void setChildren(HashMap<Character, TreeNode> children) {
		this.children = children;
	}
	public boolean isLeaf() {
		return isLeaf;
	}
	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public TreeNode() {
		
	}
	public TreeNode(char c) {
		this.c = c;
		this.isLeaf = false;
		this.children = new HashMap<>();
	}

}