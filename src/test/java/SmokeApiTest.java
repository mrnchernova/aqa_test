import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SmokeApiTest {
    private static final String BASE_URL = "https://petstore.swagger.io/v2";

    @Test
    void createUserTest() {
        String bodyJson = """
                    {
                    "id": 0,
                    "username": "string",
                    "firstName": "string",
                    "lastName": "string",
                    "email": "string",
                    "password": "string",
                    "phone": "string",
                    "userStatus": 0
                }""";


        //then -> Go to -> Implementation ==> ValidatableResponse
        ValidatableResponse response = given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(bodyJson)
                .when().post(BASE_URL + "/user").then();

        response.statusCode(200);
        response.extract().response().prettyPrint(); //log
    }
}
