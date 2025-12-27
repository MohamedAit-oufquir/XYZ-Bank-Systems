package json_sever;

import io.restassured.response.Response;
import json_classes.Comment;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostTestClass {

    @Test
    public void postTest1(){
        String postBody = "{\n" +
                "      \"id\": \"3\",\n" +
                "      \"text\": \"a comment about post 3\",\n" +
                "      \"postId\": \"3\"\n" +
                "    }";
        Response response = given().header("Content-type", "application/json")
                .body(postBody).post("http://localhost:3000/comments");
        response.prettyPrint();
    }

    @Test
    public void postTest2(){
        Comment comment = new Comment();
        comment.setId("4");
        comment.setText("this is text 4");
        comment.setPostId("4");

        Response response = given().header("Content-type", "application/json")
                .body(comment).post("http://localhost:3000/comments");
        response.prettyPrint();
    }
}
