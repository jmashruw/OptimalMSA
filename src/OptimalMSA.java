import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimalMSA {
	
	public static HashMap<String,String> databaseStrings = null;
	public static int max_frequency = -1;
	 
	public static int initialize_databaseStringsMap(String filename){
        databaseStrings = new HashMap<>();
        BufferedReader br = null;
        FileReader fr = null;
        int length = 0;
        int count = 0;
       // filename = "C:\\Users\\poorn\\Documents\\NetBeansProjects\\hw1\\src\\hw1\\database2.txt";
         try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String sCurrentLine = br.readLine();
            String temp = "";    
            String id = Arrays.asList(sCurrentLine.split(" ")).get(0);
            
            
            while ((sCurrentLine = br.readLine()) != null) {
                if(sCurrentLine.startsWith(">")){
                    databaseStrings.put(id,temp);
                    count++;
                    length += temp.length();
                    id = Arrays.asList(sCurrentLine.split(" ")).get(0);   
                    temp = "";  
                }
                else{
                    temp = temp + sCurrentLine;
                }
            }
            databaseStrings.put(id,temp);
            count++;
            length += temp.length();
	} 
        catch (FileNotFoundException ex) { }
        catch (IOException ex) { }
        finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
                } catch (IOException ex) {}
        }
        return length/count;
    }
	

	public static void main(String[] args) {
		String filename = ""; //TODO
		int L = initialize_databaseStringsMap(filename);  //L is average length
		int r = (int)Math.sqrt(L);
		
		
		for(Map.Entry<String, String> entryString_i : databaseStrings.entrySet()) {
			
			String pi = entryString_i.getValue();
			String pi_id = entryString_i.getKey();
			
			//Making keyword tree for each Pi in the database
			KeywordTree Ti = new KeywordTree();
			TreeNode root = Ti.buildTree(pi, r);
			
			//Calling sliding window on rest of the dataset with root pointing to keyword tree
			for(Map.Entry<String, String> entryString_j : databaseStrings.entrySet()) {
				if(entryString_j.getKey() == pi_id)
					continue;
				else {
					//Call sliding window
				}
			}
			
		}
	}
	
	
	

}
