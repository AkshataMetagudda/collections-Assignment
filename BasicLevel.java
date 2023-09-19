import java.util.HashMap;

public class BasicLevel {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap= new HashMap<Integer,String>();
		
		hashmap.put(1, "java");
		hashmap.put(2, "salesforce");
		hashmap.put(3, "sql");
		hashmap.put(4, "Aws");
		

		System.out.println("The value is :"+hashmap.get(1));
		System.out.println("The value is :"+hashmap.get(2));
		System.out.println("The value is :"+hashmap.get(3));
		System.out.println("The value is :"+hashmap.get(4));
		
			
	}

}
