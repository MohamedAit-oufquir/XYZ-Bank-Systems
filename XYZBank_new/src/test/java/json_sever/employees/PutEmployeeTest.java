package json_sever.employees;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import employees.Address;
import employees.Dept;
import employees.Employee;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutEmployeeTest {

    @Test
    public void putTest1(){
        Address address = new Address();
        address.setStreet("365 hello lane");
        address.setCity("Jersey City");
        address.setState("NJ");
        address.setZip(987654);

        Dept dept = new Dept();
        dept.setId(2);
        dept.setBuilding("15-b");
        dept.setName("Accounting");

        Employee employee = new Employee();
        employee.setId("2");
        employee.setFirstName("ABC");
        employee.setLastName("DEF");
        employee.setPhone(321-165-1674);
        employee.setAddress(address);
        employee.setDept(dept);

        ObjectMapper mapper = new ObjectMapper();
        String object;

        try {
            object = mapper.writeValueAsString(employee);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        Response response = given().header("Content-type", "application/json")
                .body(object).when().put("http://localhost:3000/employees/2");
        response.prettyPrint();
    }
}
