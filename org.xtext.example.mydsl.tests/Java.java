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
		JSONArray MyArray = new JSONArray(); 
		JSONObject MyInteger= new JSONObject().put("MyInteger", new Double(2)); 
		MyArray.put(MyInteger); 
		JSONObject MyInteger2= new JSONObject().put("MyInteger2", new Double(5)); 
		MyArray.put(MyInteger2); 
		JSONObject MyBoolean= new JSONObject().put("MyBoolean", new Boolean(false)); 
		MyArray.put(MyBoolean); 
		JSONObject MyNullObject= new JSONObject().put("MyNullObject", "null"); 
		MyArray.put(MyNullObject); 
		JSONArray MyArray2 = new JSONArray(); 
		JSONObject integ1= new JSONObject().put("integ1", new Double(2)); 
		MyArray2.put(integ1); 
		JSONArray MyArray3 = new JSONArray(); 
		JSONObject integ2= new JSONObject().put("integ2", new Double(2)); 
		MyArray3.put(integ2); 
		JSONObject sum= new JSONObject().put("sum", new Double(1+5+(1/5)+(1*5*2))); 
		MyArray3.put(sum); 
		MyArray2.put(MyArray3); 
		MyArray.put(MyArray2); 
		File.put("MyArray",MyArray); 
		System.out.println(File); 
		//Subset 
		JSONObject search0 = new JSONObject(); 
		for(int i=0;i<MyArray.length();i++) {
			JSONObject jsonObj0 = MyArray.getJSONObject(i);
			String k0 = jsonObj0.keys().next();
			if("integ1".equals(k0)) {
				search0.put(k0, jsonObj0.getString(k0));
			}
		}
		for(int i=0;i<MyArray.length();i++) {
			JSONObject jsonObj0 = MyArray.getJSONObject(i);
			String k0 = jsonObj0.keys().next();
			if("integ2".equals(k0)) {
				search0.put(k0, jsonObj0.getString(k0));
			}
		}
		//Insert 
		MyArray.put(integ1); 
		//Modify 
		int index1 = 0; 
		for(int i=0;i<MyArray.length();i++) {
			if(integ1.equals(MyArray.get(i))) {
				index1 = i;
			}
		}
		MyArray.remove(index1); 
		MyArray.put(integ2); 
		//Remove 
		int index2 = 0; 
		for(int i=0;i<MyArray.length();i++) {
			if(integ2.equals(MyArray.get(i))) {
				index2 = i;
			}
		}
		MyArray.remove(index2); 
		try {
			JSONParser parser = new JSONParser();
			Object pasertest = parser.parse(new FileReader( "/home/thomas/Téléchargements/test.json"));
			JSONObject test =  (JSONObject) pasertest;
			} catch (Exception io) {
				io.getMessage();
			}
			try {
				String pathtest ="/home/thomas/Téléchargements/test.json";
				FileWriter filetest = new FileWriter(pathtest);
				String jsontest = File.toString();
				filetest.write(jsontest);
				filetest.close();
			} catch (IOException io) {
				io.getMessage();
			}
			}
		}