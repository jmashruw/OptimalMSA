import java.util.HashMap;


public class KeywordTree {
	public TreeNode root;
	
	public KeywordTree() {
		root = new TreeNode();
	}
	
	public void buildTreeUtil(String s, int position) {
		HashMap<Character, TreeNode> map = root.getChildren();
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			TreeNode t;
			if(map.containsKey(c))
				t = map.get(c);
			else {
				t = new TreeNode(c);
				map.put(c, t);
			}
			map = t.getChildren();
			
			
			if(i==s.length()-1 && map.get(c)==null) {
				//map.put(c, )

				TreeNode last = new TreeNode((char)position);
				last.setLeaf(true);
				map.put((char)position, last);
			//	map = last.getChildren();
			}
			else if(i == s.length() - 1) {
				t = map.get(t.getC());
				
				while(map.size()==1) {
					map = t.getChildren();
					t = map.get(t.getC());
				}
				
				TreeNode last = new TreeNode((char)position);
				last.setLeaf(true);
				map.put((char)position, last);
			}
		  
		}
		
	}

	public TreeNode buildTree(String s, int r) {
		
		int h = s.length()/r;
		int beginIndex = 0;
		int endIndex = 0;
		root = new TreeNode();
		
		for(int i = 0; i<h; i++) {
			endIndex = ((beginIndex + h) < s.length())? beginIndex + h : s.length();
			buildTreeUtil(s.substring(beginIndex, endIndex), beginIndex);
			beginIndex = endIndex -1;	
		}
		
		return root;
	}
	
	
	
	
}
