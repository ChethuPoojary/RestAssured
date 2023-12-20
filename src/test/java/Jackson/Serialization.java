package Jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {

	public static void main(String[] args) throws JsonProcessingException {

		Employee empobj = new Employee();
		
		empobj.setFirstname("chethan");
		empobj.setLastname("kumara");
		empobj.setAge(25);
		empobj.setSalary(10000);
		empobj.setMarried(false);
		empobj.setGender("M");
	  
		ObjectMapper objmapper = new ObjectMapper();
		String jsonstring = objmapper.writerWithDefaultPrettyPrinter().writeValueAsString(empobj);
	    System.out.println(jsonstring);
	}

}
