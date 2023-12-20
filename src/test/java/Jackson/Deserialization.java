package Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		String payload = "{\r\n"
				+ "  \"firstname\" : \"chethan\",\r\n"
				+ "  \"lastname\" : \"kumara\",\r\n"
				+ "  \"age\" : 25,\r\n"
				+ "  \"salary\" : 10000,\r\n"
				+ "  \"Married\" : false,\r\n"
				+ "  \"gender\" : \"M\"\r\n"
				+ "}";
		
		ObjectMapper objmapper = new ObjectMapper();
		Employee emp = objmapper.readValue(payload,Employee.class);
		
		System.out.println(emp.getFirstname());
		System.out.println(emp.getLastname());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		System.out.println(emp.getMarried());
		System.out.println(emp.getGender());
		
	}

}
