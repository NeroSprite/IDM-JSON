import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Java {
	public static void main(String args[]) {
		JSONObject Name = new JSONObject(); 
		JSONObject i= new JSONObject().put("i", new Double(2)); 
		Name.put("i",i); 
		try {
			JSONParser parser = new JSONParser();
			Object pasertest = parser.parse(new FileReader( "/home/thomas/Téléchargements/test.json"));
			JSONObject test =  (JSONObject) pasertest;
			} catch (Exception io) {
				io.getMessage();
			}
			}
		}