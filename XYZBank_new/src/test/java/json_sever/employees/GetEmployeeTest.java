package json_sever.employees;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import employees.Employee;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.*;

public class GetEmployeeTest {


    @Test
    public void getTest1(){
        baseURI = "http://localhost";
        port = 3000;
        Response response = given().when().get("/employees");
        response.prettyPrint();
        List<String> streets = response.then().extract().path("address.street");
        //String street2 = response.getBody().path("[0].address.street");
        System.out.println(streets.get(0));
    }

    @Test
    public void getTest2(){
        Response response = given().when().get("http://localhost:3000/employees");

        ObjectMapper mapper = new ObjectMapper();

        try {
            Employee[] employees = mapper.readValue(response.getBody().asString(), Employee[].class);
            List<Employee> employees1 = Arrays.asList(employees);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        List<Employee> employees2 = Arrays.asList(response.getBody().as(Employee[].class));
        System.out.println(employees2.get(0).getDept().getName()+" **********");
        String deptName = employees2.get(0).getDept().getName();
        Assert.assertEquals(deptName, "Fin");
    }
}
