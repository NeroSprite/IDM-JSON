import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Java {
	public static void main(String args[]) {
		JSONObject File = new JSONObject(); 
		JSONArray Tab = new JSONArray(); 
		JSONObject Str= new JSONObject().put("Str", "Value"); 
		Tab.put(Str); 
		File.put("Tab",Tab); 
		JSONObject Name= new JSONObject().put("Name", new Double(2)); 
		File.put("Name",Name); 
		JSONObject Name2= new JSONObject().put("Name2", new Double(2)); 
		File.put("Name2",Name2); 
		//Insert 
		Tab.put(Name); 
		//Modify 
		int index0 = 0; 
		for(int i=0;i<Tab.length();i++) {
			if(Name.equals(Tab.get(i))) {
				index0 = i;
			}
		}
		Tab.remove(index0); 
		Tab.put(Name2); 
		}
	}