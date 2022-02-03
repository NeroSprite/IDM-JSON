public class Java {
	public static void main(String args[]) {
		JSONObject File = new JSONObject(); 
		JSONArray MyArray = new JSONArray(); 
		MyArray.put(MyInteger, new Double(2)); 
		MyArray.put(MyInteger, new Double(5)); 
		MyArray.put(MyBoolean, new Boolean(false)); 
		MyArray.put(MyNullObject, null); 
		JSONArray MyArray2 = new JSONArray(); 
		MyArray2.put(MyInteger2, new Double(2)); 
		JSONArray MyArray3 = new JSONArray(); 
		MyArray3.put(MyInteger3, new Double(2)); 
		MyArray2.put(MyArray3); 
		MyArray.put(MyArray2); 
		File.put(MyArray); 
		}
	}