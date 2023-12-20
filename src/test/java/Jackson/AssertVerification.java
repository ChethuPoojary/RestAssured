package Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;


public class AssertVerification {

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
		
	 assertThat(emp.getFirstname()).isEqualTo("chethan").isNotEmpty();
	 
	 System.out.println(emp.getFirstname());
		
		
		
	}

}
