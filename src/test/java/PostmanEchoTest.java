import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanEchoTest {
    @Test
    void shouldReturnName() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Аркадий Паровозов")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Аркадий Паровозов"))
        ;
    }

}