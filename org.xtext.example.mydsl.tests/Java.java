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
		JSONObject Name= new JSONObject().put("Name", "Value"); 
		Tab.put(Name); 
		File.put("Tab",Tab); 
		//Subset 
		JSONObject search0 = new JSONObject(); 
		for(int i=0;i<Tab.length();i++) {
			JSONObject jsonObj0 = Tab.getJSONObject(i);
			String k0 = jsonObj0.keys().next();
			if("Name".equals(k0)) {
				search0.put(k0, jsonObj0.getString(k0));
			}
		}
		for(int i=0;i<Tab.length();i++) {
			JSONObject jsonObj0 = Tab.getJSONObject(i);
			String k0 = jsonObj0.keys().next();
			if("test".equals(k0)) {
				search0.put(k0, jsonObj0.getString(k0));
			}
		}
		}
	}