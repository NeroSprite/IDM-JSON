import org.json.JSONArray;
import org.json.JSONObject;

public class Java {
	public static void main(String args[]) {
		JSONObject Test = new JSONObject(); 
		JSONObject Test2= new JSONObject().put("Test2", new Double(2)); 
		Test.put("Test2",Test2); 
		System.out.println(Test); 
		}
	}