package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class RestClientSample {

	
	public static final String GET_ALL_STUDENTS_API="http://localhost:8080/ST/all";
	public static final String GET_TEST_STUDENT_API="http://localhost:8080/ST/testStudent";
	static RestTemplate restTemplate=new RestTemplate();
	
	public static void main(String args[]) {
		
		getallStudentsAPI();
		System.out.println("_________________________________");
		getOneStudentAPI();
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
		
	}
	

	//This method retrieves all the students .Here all the student details are retrived using API call
	//The API is also on my local system,which is developed under StudentProjWithDB 
	private static void getallStudentsAPI() {
       
		System.out.println("in getallStudentsAPI");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		ResponseEntity<String> result = restTemplate.exchange(GET_ALL_STUDENTS_API, HttpMethod.GET,entity,String.class);
		System.out.println(result);
		

	}
	
	private static void getOneStudentAPI() {

		Map<String,Integer> param = new HashMap();
		param.put("id",10);
		System.out.println("in getTestStudentAPI");
		Student result = restTemplate.getForObject(GET_TEST_STUDENT_API,Student.class,param);
		System.out.println(result);
		System.out.println("________________");
		
		System.out.println("id from result:"+result.getId());
		
		System.out.println("############");
		
	}


	
}	
	