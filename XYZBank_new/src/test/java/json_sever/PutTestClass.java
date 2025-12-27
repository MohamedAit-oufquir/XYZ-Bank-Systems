package json_sever;

import io.restassured.response.Response;
import json_classes.Comment;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutTestClass {

    @Test
    public void putTest1(){
        Comment comment = new Comment();
        comment.setId("1");
        comment.setText("hello world, how are you?");
        comment.setPostId("1");

        Response response = given().header("Content-type", "application/json")
                .body(comment).put("http://localhost:3000/comments/2");
        response.prettyPrint();
    }
}
