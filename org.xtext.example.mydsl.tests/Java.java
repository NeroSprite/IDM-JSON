import org.json.JSONArray;
import org.json.JSONObject;

public class Java {
	public static void main(String args[]) {
		JSONObject File = new JSONObject(); 
		JSONArray MyArray = new JSONArray(); 
		MyArray.put(0, new Double(2)); 
		File.put("MyArray",MyArray); 
		}
	}