import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.IntStream;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Java {
	public static void main(String args[]) {
		JSONObject File = new JSONObject(); 
		JSONObject add= new JSONObject().put("add", new Double(((6-3)+5)+4)); 
		File.put("add",add); 
		System.out.println(add); 
		}
	}