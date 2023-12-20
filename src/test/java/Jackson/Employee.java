package Jackson;


import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Employee {
	
	@JsonProperty("firstname")
	private String firstname;
	@JsonProperty("lastname")
	private String lastname;
	@JsonProperty("age")
	private Integer age;
	@JsonProperty("salary")
	private Integer salary;
	@JsonProperty("Married")
	private Boolean married;
	@JsonProperty("gender")
	private String gender;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	@JsonProperty("firstname")
	public String getFirstname() {
	return firstname;
	}

	@JsonProperty("firstname")
	public void setFirstname(String firstname) {
	this.firstname = firstname;
	}

	@JsonProperty("lastname")
	public String getLastname() {
	return lastname;
	}

	@JsonProperty("lastname")
	public void setLastname(String lastname) {
	this.lastname = lastname;
	}

	@JsonProperty("age")
	public Integer getAge() {
	return age;
	}

	@JsonProperty("age")
	public void setAge(Integer age) {
	this.age = age;
	}

	@JsonProperty("salary")
	public Integer getSalary() {
	return salary;
	}

	@JsonProperty("salary")
	public void setSalary(Integer salary) {
	this.salary = salary;
	}

	@JsonProperty("Married")
	public Boolean getMarried() {
	return married;
	}

	@JsonProperty("Married")
	public void setMarried(Boolean married) {
	this.married = married;
	}

	@JsonProperty("gender")
	public String getGender() {
	return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
	this.gender = gender;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}
